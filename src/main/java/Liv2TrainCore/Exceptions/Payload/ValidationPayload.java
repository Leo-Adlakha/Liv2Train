package Liv2TrainCore.Exceptions.Payload;

import org.springframework.http.HttpStatus;

/**
 * Custom Payload for Validation Exceptions
 */
public class ValidationPayload {

    private String message ;
    private HttpStatus httpStatus ;

    public ValidationPayload() {
    }

    public ValidationPayload(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
