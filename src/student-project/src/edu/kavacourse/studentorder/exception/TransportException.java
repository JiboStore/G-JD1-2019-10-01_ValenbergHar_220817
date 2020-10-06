package edu.kavacourse.studentorder.exception;

public class TransportException  extends Exception{


    public TransportException(String message) {
        super(message);
    }

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }
}
