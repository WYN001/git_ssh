package com.ssh.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ssh.entity.Emp;

public interface EmpDao {
	public void save(Emp emp);
	public List<Emp> list();

}
