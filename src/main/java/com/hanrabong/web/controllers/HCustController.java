package com.hanrabong.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanrabong.web.services.HCustService;
import com.hanrabong.web.seviceImpls.HCustServiceImpl;

@Controller
@RequestMapping("/hcust/*")
public class HCustController {
	private static final Logger logger = LoggerFactory.getLogger(HCustController.class);
	@Autowired HCustServiceImpl hCustService;
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = hCustService.countHCusts();
		model.addAttribute("count",count);
		return"index";
	}
	@GetMapping("/info")
	public String findHCustByCId(@RequestParam("cid") String cid) {
		return "index";
	}
	//develop
	
	
	@GetMapping
    public String home(Locale locale, Model model) {
         logger.info("Welcome {}.", "HomeController");
         
         
         return "home";
    }
	
}
