package com.fsdm.crm.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handelBusinessException(HttpServletRequest req, BusinessException e) {
		// Otherwise setup and send the user to a default error-view.
		Map<String, Object> body = new LinkedHashMap<>();
	    body.put("Status", HttpStatus.PRECONDITION_FAILED.value());
	    body.put("timestamp", LocalDateTime.now());
	    body.put("message", "BusinessException has throws with error : "+e.getError());
	    return new ResponseEntity<>(body, HttpStatus.PRECONDITION_FAILED);
	}

	 @Override
	 protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	        List<String> details = new ArrayList<>();
	        for(ObjectError error : ex.getBindingResult().getAllErrors()) {
	            details.add(error.getDefaultMessage());
	        }
	        ErrorResponseView error = new ErrorResponseView("Validation Failed", details);
	        return new ResponseEntity(error, HttpStatus.NOT_ACCEPTABLE);
	    }
	
}
