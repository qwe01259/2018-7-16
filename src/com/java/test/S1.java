package com.java.test;

public class S1 {

	
	 public static void main(String[] args) {
          //赋值多态
		Person p=new Worker();
			Person p1=new Student();
			p1.action();
			p.action();
			
	/*	 Student p=new Student();
		 Worker p1=new Worker();
		 test(p);
		*/
		 
	}
	 //传参多态
	 public static void test(Person p){

		
	 }
}
