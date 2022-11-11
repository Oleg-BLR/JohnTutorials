package com.john.exceptions.custom;

public class AgeLessThenZeroException extends IllegalArgumentException {
    public AgeLessThenZeroException() {
    }

    public AgeLessThenZeroException(String message) {
        super(message);
    }

    public AgeLessThenZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThenZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
