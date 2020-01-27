package com.college;

public class Student {

	String name;
	int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void printDetails() {
		System.out.println("Roll No: "+rollNo+"\nName: "+name);
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
	}
}
