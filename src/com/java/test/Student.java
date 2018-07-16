package com.java.test;

public class Student extends Person {
   private  double grade;
   private String sno;
   
   
public double getGrade() {
	return grade;
}
public void setGrade(double grade) {
	this.grade = grade;
}
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}
public Student(String name, int age, double height,double grade, String sno) {
	super(name,age,height);
	this.grade = grade;
	this.sno = sno;
}
public Student() {
	super();
}
   @Override
	public void action() {
		// TODO Auto-generated method stub
	   System.out.println("学生在学习");
		
	}




}
