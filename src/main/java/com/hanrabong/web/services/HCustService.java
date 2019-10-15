package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.HCustDTO;


@Component
public interface HCustService {

	public int countHCusts();
	
	public HCustDTO login(HCustDTO eb);
	public Boolean join(HCustDTO eb);

	public List<DeptDTO> findDept();	
	public List<HCustDTO> findEmps();	
	public HCustDTO findEmp(HCustDTO eb);	
	
}
