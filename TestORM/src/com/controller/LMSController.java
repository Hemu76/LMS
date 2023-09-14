package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.AppService;

@Controller
public class LMSController {

	AppService dao;

	@Autowired
	public LMSController(AppService dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {

		return "login";
	}
}
