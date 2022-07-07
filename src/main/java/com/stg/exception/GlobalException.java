package com.stg.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import com.stg.entity.ResponseError;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ResponseError> handleException(CustomException customException, HttpServletRequest httpServletRequest){
		ResponseError responseError = new ResponseError(customException.getMessage(),httpServletRequest.getRequestURI());
		return new ResponseEntity<ResponseError>(responseError,HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(value = HttpClientErrorException.class)
	public ResponseEntity<ResponseError> handleException(HttpClientErrorException httpClientErrorException, HttpServletRequest httpServletRequest){
		ResponseError responseError = new ResponseError(httpClientErrorException.getMessage(),httpServletRequest.getRequestURI());
		return new ResponseEntity<ResponseError>(responseError,HttpStatus.EXPECTATION_FAILED);
	}
	
}
