package com.hanrabong.web.seviceImpls;

import java.util.List;

import com.hanrabong.web.domains.DeptBean;
import com.hanrabong.web.domains.EmpBean;
import com.hanrabong.web.services.EmpService;

public class EmpServiceImpl implements EmpService{

	private static EmpServiceImpl instance = new EmpServiceImpl();
	private EmpServiceImpl () {}
	public static EmpServiceImpl getInstance() {return instance;}
	
	
	@Override
	public EmpBean login(EmpBean eb) {
		
		return null;
	}

	@Override
	public Boolean join(EmpBean eb) {
		
		return null;
	}

	@Override
	public List<DeptBean> findDept() {
		return  null;
	}

	@Override
	public List<EmpBean> findEmps() {
		return null;
	}

	@Override
	public EmpBean findEmp(EmpBean eb) {
		return null;
	}

}
