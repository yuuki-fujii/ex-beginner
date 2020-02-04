package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam03Form;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@ModelAttribute
	public Exam03Form setUpForm() {
		return new Exam03Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "/exam03/exam03";
	}
	
	@RequestMapping("/result")
	public String result(Exam03Form form) {
		Integer nonTaxSumPrice = form.getIntPrice1() + form.getIntPrice2() + form.getIntPrice3();
		Integer taxSumPrice = nonTaxSumPrice * 110 / 100;
		
		application.setAttribute("nonTaxSumPrice",nonTaxSumPrice);
		application.setAttribute("taxSumPrice",taxSumPrice);
		return "/exam03/exam03-result";
	}
	
}
