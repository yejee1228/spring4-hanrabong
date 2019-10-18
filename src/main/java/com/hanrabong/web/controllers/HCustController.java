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
	
	@PostMapping("/join")
	public @ResponseBody Map<String,String> join(@RequestBody HCustDTO cust) {
		logger.info("ajax가 보낸 id와 pw {}",cust.getCid()+", "+cust.getCpw());
		HashMap<String,String> map = new HashMap<>();
		map.put("cid", cust.getCid());
		map.put("cpw", cust.getCpw());
		logger.info("map에 있는 id와 pw {}",map.get("cid")+", "+map.get("cpw"));
		return map;
	}

	@Autowired HCustServiceImpl hCustService;
	
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = hCustService.countHCusts();
		model.addAttribute("count",count);
		return"index";
	}
	
}
