package com.j2boot.fandom.common.result;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *  返回通用 api code
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ResultCode implements IErrorCode {

    SUCCESS(0, "操作成功"),
    FAILED(-1, "操作失败"),
    VALIDATE_FAILED(-2, "参数检验失败"),

    ;
    /**
     * code
     */
    private int code;
    /**
     * msg
     */
    private String msg;
}
