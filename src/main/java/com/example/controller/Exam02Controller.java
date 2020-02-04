package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam02Form;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public Exam02Form setUpForm() {
		return new Exam02Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "/exam02/exam02";
	}
	
	@RequestMapping("/result")
	public String result(Exam02Form form) {
		Integer result = form.getIntNum1() + form.getIntNum2();
		session.setAttribute("num1", form.getIntNum1());
		session.setAttribute("num2", form.getIntNum2());
		session.setAttribute("result", result);
		return "/exam02/exam02-result";
	}
	
	@RequestMapping("/result2")
	public String result2(){
		return "/exam02/exam02-result2"; 
	}
}

