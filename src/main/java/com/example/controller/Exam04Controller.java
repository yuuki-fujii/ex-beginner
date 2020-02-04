package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "/exam04/exam04";
	}
	
	@RequestMapping("/to-result")
	public String tpResult(@Validated UserForm form, BindingResult result,
							RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return index();
		}
		
		User user = new User();
		BeanUtils.copyProperties(form, user);
		user.setAge(form.getIntAge());
		redirectAttributes.addFlashAttribute("user",user);
		return "redirect:/exam04/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "/exam04/exam04-result";
	}
}
