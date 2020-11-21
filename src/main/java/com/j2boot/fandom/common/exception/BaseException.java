package com.j2boot.fandom.common.exception;

import com.j2boot.fandom.common.result.ResultCode;
import lombok.Getter;

/**
 * @author yichengxian
 * 自定义异常
 */
@Getter
public class BaseException extends RuntimeException {
    /**
     *
     */
    private ResultCode resultCode;

    /**
     * override
     * @return
     */
    @Override
    public  Throwable fillInStackTrace() {

        return this;
    }

    /**
     *
     * @param resultCode
     */
    public BaseException(ResultCode resultCode){
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    /**
     *
     * @param msg
     */
    public BaseException(String msg){
        super(msg);
        this.resultCode =ResultCode.FAILED;
    }


}
