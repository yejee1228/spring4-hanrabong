package com.hanrabong.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanrabong.web.services.EmpService;

@Controller
@RequestMapping("/Emp/*")
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	@Autowired EmpService empService;
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = empService.countEmp();
		model.addAttribute("count",count);
		return"index";
	}
	@GetMapping("/info")
	public String findEmpByCId(@RequestParam("cid") String cid) {
		return "index";
	}
	//develop
	
	
}
