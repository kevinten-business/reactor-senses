package com.kevinten.senses.core.error.exception;


import com.kevinten.vrml.error.code.ErrorCodeContext;
import com.kevinten.vrml.error.exception.ErrorCodeException;

public abstract class StreamErrorCodeException extends ErrorCodeException {

    public StreamErrorCodeException(ErrorCodeContext errorCodeContext) {
        super(errorCodeContext);
    }

    public StreamErrorCodeException(ErrorCodeContext errorCodeContext, Throwable cause) {
        super(errorCodeContext, cause);
    }

    public StreamErrorCodeException(ErrorCodeContext errorCodeContext, String errorMessage) {
        super(errorCodeContext, errorMessage);
    }

    public StreamErrorCodeException(ErrorCodeContext errorCodeContext, String errorMessage, Throwable cause) {
        super(errorCodeContext, errorMessage, cause);
    }
}
