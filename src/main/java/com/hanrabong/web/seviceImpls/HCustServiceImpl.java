package com.hanrabong.web.seviceImpls;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.mappers.HCustMapper;
import com.hanrabong.web.services.HCustService;
@Service
public class HCustServiceImpl implements HCustService{

	@Autowired HCustMapper hCustMapper;
	@Autowired HCustDTO hCustDTO;
	
	@Override
	public int countHCusts() {
		return hCustMapper.countHCusts();
	}
	@Override
	public HCustDTO login(HCustDTO param) {
		hCustDTO=hCustMapper.selectCustByCid(param);
		return hCustDTO;
	}
	@Override
	public Boolean joinid(HCustDTO param) {
		boolean f = (hCustMapper.selectCnumByCid(param)!=null)?false:true;
		return f;
	}
	@Override
	public Boolean join(HCustDTO param) {
		boolean f = false;
		if(joinid(param)) {
			param.setCnum(String.valueOf(countHCusts()+1));
			hCustMapper.insertCust(param);
			f = true;
		}
		return f;
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
