package com.ssh.service;

import java.util.List;

import com.ssh.dao.EmpDao;
import com.ssh.entity.Emp;

public class EmpServiceImp implements EmpService{
	
	private EmpDao empDao;
	
	
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void add(Emp emp) {
		empDao.save(emp);
	}

	@Override
	public List<Emp> getEmps() {
		return empDao.list();
	}
	
	
	

}
