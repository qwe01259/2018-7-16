package com.java.test;

public abstract  class Person {
   private String name;
   private int age;
   private double height;
   
   
public final double getHeight() {
	return height;
}
public final void setHeight(double height) {
	this.height = height;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person() {
	super();
}
public Person(String name, int age, double height) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
}
public abstract void action();

}
