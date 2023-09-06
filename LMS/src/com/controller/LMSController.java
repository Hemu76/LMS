package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.models.Customer;
import com.models.LoanApplicantNominee;
import com.models.LoanApplication;
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

	@RequestMapping(value = "/savenewc", method = RequestMethod.POST)
	public String saveNewC(@Validated Customer c, Model model) {
		dao.addC(c);
		return "success";
	}

	@RequestMapping(value = "/savenewa", method = RequestMethod.POST)
	public String saveNewA(@Validated LoanApplication l, Model model) {
		dao.addLa(l);
		return "success";
	}

	@RequestMapping(value = "/savenewn", method = RequestMethod.POST)
	public String saveNewN(@Validated LoanApplicantNominee n, Model model) {
		dao.addN(n);
		return "success";
	}
}
