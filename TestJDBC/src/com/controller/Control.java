package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Dao;
import com.models.PharmacyRecord;

@Controller
public class Control {
	Dao dc;

	@Autowired
	public Control(Dao dc) {
		this.dc = dc;
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String data(Model mm) {
		ArrayList<PharmacyRecord> al = null;
		System.out.println(al.size() + "jyhgjjhg");
		mm.addAttribute("adata", al);
		return "Home";
	}
}