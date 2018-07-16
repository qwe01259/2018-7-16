package com.java.test;

public class Worker extends Person {
   private String wno;
   private double salary;
   
   
public String getWno() {
	return wno;
}
public void setWno(String wno) {
	this.wno = wno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Worker() {
	super();
}
public Worker(String name, int age, double height,String wno, double salary) {
	super(name,age,height);
	this.wno = wno;
	this.salary = salary;
	
	
}
   @Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("工人在工作");
	}
   
   
   
	
	
	
	
}
