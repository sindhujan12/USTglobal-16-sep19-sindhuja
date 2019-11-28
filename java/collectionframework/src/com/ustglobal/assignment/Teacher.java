package com.ustglobal.assignment;

public class Teacher {
String sub;
String name;
double salary;
public Teacher(String sub, String name, double salary) {
	super();
	this.sub = sub;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Teacher [sub=" + sub + ", name=" + name + ", salary=" + salary + "]";
}

}
