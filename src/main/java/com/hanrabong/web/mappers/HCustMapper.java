package com.hanrabong.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.HCustDTO;

@Repository
public interface HCustMapper {
    public int countHCusts();

	public HCustDTO login(HCustDTO eb);
	public Boolean insetEmp(HCustDTO eb);

	public List<DeptDTO> selectDept();	
	public List<HCustDTO> selectEmps();	
	public HCustDTO selectEmp(HCustDTO eb);	
	
	
	
	
}
