package com.kevinten.senses.core.error.exception;


import com.kevinten.vrml.error.code.ErrorCodeContext;

public class StreamParamErrorCodeException extends StreamErrorCodeException {

    public StreamParamErrorCodeException(ErrorCodeContext errorCodeContext) {
        super(errorCodeContext);
    }

    public StreamParamErrorCodeException(ErrorCodeContext errorCodeContext, Throwable cause) {
        super(errorCodeContext, cause);
    }

    public StreamParamErrorCodeException(ErrorCodeContext errorCodeContext, String errorMessage) {
        super(errorCodeContext, errorMessage);
    }

    public StreamParamErrorCodeException(ErrorCodeContext errorCodeContext, String errorMessage, Throwable cause) {
        super(errorCodeContext, errorMessage, cause);
    }
}
