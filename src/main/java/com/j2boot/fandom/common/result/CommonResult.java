package com.j2boot.fandom.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @param <T>
 * @author yichengxian
 * 公共返回参数
 */
@AllArgsConstructor
@Getter
public class CommonResult<T> {

    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;

    /**
     * 时间戳
     */
    private long time;


    /**
     *
     * @param code
     * @param msg
     */
    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

        this.time = System.currentTimeMillis();
    }

    /**
     *
     * @param code
     * @param msg
     * @param data
     */
    public CommonResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.time = System.currentTimeMillis();
    }

    /**
     * 返回成功结果
     *
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(
                ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg(),
                data
        );
    }

    /**
     * 返回失败的结果并且展示msg
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String msg) {
        return new CommonResult(
                ResultCode.FAILED.getCode(),
                msg,
                null
        );
    }

    /**
     * 返回失败结果
     *
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed() {
        return new CommonResult(
                ResultCode.FAILED.getCode(),
                ResultCode.FAILED.getMsg(),
                null
        );
    }

    /**
     * 校验失败
     *
     * @param paramName 参数名
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validateFailed(String paramName) {
        return new CommonResult(
                ResultCode.VALIDATE_FAILED.getCode(),
                ResultCode.VALIDATE_FAILED.getMsg(),
                paramName
        );
    }


}
