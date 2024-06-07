package com.api.prefeitura.medicamento.controller.exception;

import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    /**
     * vai capturar a exception do spring quando o mesmo arquivo ja foi importado no job do batch
     * */
    @ExceptionHandler(JobInstanceAlreadyCompleteException.class)
    private ResponseEntity<Object> handleFileAlreadyImported(JobInstanceAlreadyCompleteException exception){

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("O arquivo já foi importado no sistema!");
    }


}
