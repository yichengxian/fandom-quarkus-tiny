package com.j2boot.fandom.common.exception.handler;

import com.j2boot.fandom.common.exception.BaseException;
import com.j2boot.fandom.common.result.CommonResult;
import com.j2boot.fandom.common.result.ResultCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常捕获
 *
 * @author yichengxian
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResult exceptionHandler(Exception exception) {
        //exception.getMessage();
        exception.printStackTrace();
        return CommonResult.failed();
    }


    /**
     *
     * @param baseException
     * @return
     */
    @ExceptionHandler(value = BaseException.class)
    public CommonResult baseExceptionHandler(BaseException baseException){
        //
        ResultCode resultCode = baseException.getResultCode();
        CommonResult result = new CommonResult(resultCode.getCode(), baseException.getMessage());
        return result;
    }

}

