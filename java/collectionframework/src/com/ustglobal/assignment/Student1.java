package com.ustglobal.assignment;

public class Student1 {
int id;
String name;
String clg;
String dept;
double mobileno;
public Student1(int id, String name, String clg, String dept, double mobileno) {
	super();
	this.id = id;
	this.name = name;
	this.clg = clg;
	this.dept = dept;
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", clg=" + clg + ", dept=" + dept + ", mobileno=" + mobileno + "]";
}

}
