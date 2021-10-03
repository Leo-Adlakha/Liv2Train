package Liv2TrainCore.Exceptions;

import Liv2TrainCore.Exceptions.Payload.ValidationPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *  Exception Handler for Validation of Fields
 */

@ControllerAdvice
public class TrainingCenterExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException e) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST ;
        return new ResponseEntity<>(new ValidationPayload(
                "Invalid Fields, Please enter a valid Request!",
                httpStatus
        ), httpStatus) ;
    }

}
