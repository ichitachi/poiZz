package com.gau.dora.exception;

public class ReflectInstantiationException extends RuntimeException{
    public ReflectInstantiationException(String message) {
        super(message);
    }

    public ReflectInstantiationException(String message, Throwable cause) {
        super(message, cause);
    }
}
