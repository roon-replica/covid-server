package com.skp.intern.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView nullPointerException(NullPointerException ne){
        ModelAndView modelAndView = new ModelAndView("5xx");
        modelAndView.addObject("status",HttpStatus.INTERNAL_SERVER_ERROR);
        modelAndView.addObject("errorMsg",ne.getMessage());

        return modelAndView;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ModelAndView illegalArgException(IllegalArgumentException ie){
        ModelAndView modelAndView = new ModelAndView("5xx");
        modelAndView.addObject("status",HttpStatus.INTERNAL_SERVER_ERROR);
        modelAndView.addObject("errorMsg",ie.getMessage());

        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e){
        ModelAndView modelAndView = new ModelAndView("5xx");
        modelAndView.addObject("status",HttpStatus.INTERNAL_SERVER_ERROR);
        modelAndView.addObject("errorMsg",e.getMessage());

        return modelAndView;
    }
}
