package com.rhino.easydevdemo.http.result;

/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class BaseResult<T> {

    public Error error;
    private T value;

    @Override
    public String toString() {
        return "BaseResult{" +
                "error=" + error +
                ", value=" + value +
                '}';
    }

    public static class Error {
        public String errorCode;
        public String message;
        public String errorType;
        @Override
        public String toString() {
            return "Error{" +
                    "errorCode='" + errorCode + '\'' +
                    ", message='" + message + '\'' +
                    ", errorType='" + errorType + '\'' +
                    '}';
        }
    }
}
