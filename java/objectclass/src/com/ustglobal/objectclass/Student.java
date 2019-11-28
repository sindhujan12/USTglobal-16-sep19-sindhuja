package com.ustglobal.objectclass;

public class Student {
	
int id;
String name;
double percent;
public Student(int id, String name, double percent) {
	super();
	this.id = id;
	this.name = name;
	this.percent = percent;
}

@Override
public int hashCode() {
	return id;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percent=" + percent + "]";
}


}
