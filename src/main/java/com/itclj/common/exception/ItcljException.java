package com.itclj.common.exception;

import com.itclj.common.enums.CodeEnum;

/**
 * Create by lujun.chen on 2018/09/29
 */
public class ItcljException extends RuntimeException {
    private int code;
    private String message;

    public ItcljException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    public ItcljException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ItcljException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
