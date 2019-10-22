package com.hanrabong.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.seviceImpls.HCustServiceImpl;

@Controller
@RequestMapping("/hcust/*")
public class HCustController {
	private static final Logger logger = LoggerFactory.getLogger(HCustController.class);
	@Autowired HCustDTO cust;
	@Autowired HCustServiceImpl hCustService;
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody HCustDTO param) {
		HashMap<String,Object> map = new HashMap<>();
		hCustService.join(param);
		map.put("cid", param.getCid());
		map.put("cpw", param.getCpw());
		map.put("cnum", param.getCnum());
		logger.info("map에 있는 id와 cnum {}",map.get("cid")+", "+map.get("cnum"));
		return map;
	}
	
	@PostMapping("/login")
	public @ResponseBody HCustDTO login (@RequestBody HCustDTO param){
		HashMap<String,String> map = new HashMap<>();
		logger.info("login id와 pw {}",param.getCid()+", "+param.getCpw());
		cust = hCustService.login(param);
		logger.info("login map에 있는 사용자정보 {}",cust.toString());
		return cust;
	} 
	
	@PostMapping("/mypage")
	public @ResponseBody HCustDTO mypage (@RequestBody HCustDTO param){
		HashMap<String,String> map = new HashMap<>();
		logger.info("login id와 pw {}",param.getCid()+", "+param.getCpw());
		cust.setCid(param.getCid());
		cust.setCpw(param.getCpw());
		logger.info("login map에 있는 사용자정보 {}",cust.toString());
		return cust;
	} 

	
	
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = hCustService.countHCusts();
		model.addAttribute("count",count);
		return"index";
	}
	
}
