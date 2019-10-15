package com.hanrabong.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class EmpDTO implements Serializable{
	private static final long serialVersionUID= 1L;

	@SuppressWarnings("unused")
	private String empNo, eName, job, mgr,
	hireDate, sal, comm, deptNo , dName;
	

}



