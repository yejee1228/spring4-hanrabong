package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hanrabong.web.domains.DeptBean;
import com.hanrabong.web.domains.EmpBean;



public interface EmpService {
	
	public EmpBean login(EmpBean eb);
	public Boolean join(EmpBean eb);

	public List<DeptBean> findDept();	
	public List<EmpBean> findEmps();	
	public EmpBean findEmp(EmpBean eb);	
	
}
