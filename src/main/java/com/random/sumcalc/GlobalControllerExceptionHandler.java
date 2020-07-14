package com.random.sumcalc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errorType", e.getClass());
		modelAndView.addObject("exception", e.getCause());
		modelAndView.addObject("message", e.getMessage());
		modelAndView.setViewName("calculate");
			
		return modelAndView;
	}
}