package com.ssh.service;

import java.util.List;

import com.ssh.entity.Emp;

public interface EmpService {
	
	public void add(Emp emp);
	public List<Emp> getEmps();

}
