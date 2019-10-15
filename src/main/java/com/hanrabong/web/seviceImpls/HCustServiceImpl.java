package com.hanrabong.web.seviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.mappers.HCustMapper;
import com.hanrabong.web.services.HCustService;
@Service
public class HCustServiceImpl implements HCustService{

	@Autowired HCustMapper hCustMapper;
	
	@Override
	public int countHCusts() {
		
		return hCustMapper.countHCusts();
	}
	
	
	@Override
	public HCustDTO login(HCustDTO eb) {
		
		return null;
	}

	@Override
	public Boolean join(HCustDTO eb) {
		
		return null;
	}

	@Override
	public List<DeptDTO> findDept() {
		return  null;
	}

	@Override
	public List<HCustDTO> findEmps() {
		return null;
	}

	@Override
	public HCustDTO findEmp(HCustDTO eb) {
		return null;
	}



}
