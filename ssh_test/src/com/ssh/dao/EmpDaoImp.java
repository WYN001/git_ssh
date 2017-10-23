package com.ssh.dao;

import java.util.List;

import org.hibernate.Session;




import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ssh.entity.Emp;

public class EmpDaoImp implements EmpDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	} 
	@Override
	public void save(Emp emp){
		Session session=getSession();
		session.save(emp);
	}

	@Override
	public List<Emp> list() {
		Session session=getSession();
		List<Emp> emps= session.createQuery("from Emp").list();
		return emps;
	}
}
