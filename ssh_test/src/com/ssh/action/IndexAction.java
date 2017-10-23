package com.ssh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Emp;
import com.ssh.service.EmpService;
import com.ssh.service.EmpServiceImp;

public class IndexAction extends ActionSupport {
	public String name;
	public String sex;
	public Integer age;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

	private EmpService empService;


	public EmpService getEmpService() {
		return empService;
	}


	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}


	public String execute1(){
		Emp emp=new Emp(name,sex,age);
		System.out.println(EmpService.class);
		System.out.println(emp);
		empService.add(emp);
		ActionContext.getContext().put("msg", "员工添加成功");
		return "success";
	}
	
	public String execute2(){
		List<Emp> emps=empService.getEmps();
		ActionContext.getContext().put("emps", emps);
	
		return "input";
	}
	

}
