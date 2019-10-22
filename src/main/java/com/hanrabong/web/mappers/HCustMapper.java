package com.hanrabong.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.HCustDTO;

@Repository
public interface HCustMapper {
    public int countHCusts();

    public Boolean insertCust(HCustDTO eb);
	public HCustDTO selectCnumByCid(HCustDTO eb);
	public HCustDTO selectCustByCid(HCustDTO eb);
	
	public List<DeptDTO> selectDept();	
	public List<HCustDTO> selectEmps();	
	public HCustDTO selectEmp(HCustDTO eb);	
	
	
	
	
}
