package com.example.controller;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private Servlet application;
	
	@RequestMapping("")
	public String index() {
		return "/exam03/exam03";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "/exam03/exam03-result";
	}
	
}
