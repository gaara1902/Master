/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.ips.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import py.gov.ips.exception.IpsException;
import py.gov.ips.beans.Error;


@ControllerAdvice
@RestController
public class controllerAdv extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {IpsException.class})
    protected ResponseEntity<Object> handleConflict(
            IpsException ex, WebRequest request) {
        return new ResponseEntity(ex.getError(), ex.getStatus());

    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handle(Exception ex,
            HttpServletRequest request, HttpServletResponse response) {
        if (!(ex instanceof NullPointerException)) {
            return new ResponseEntity(new Error("Error interno del servidor", "g102"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }

}
