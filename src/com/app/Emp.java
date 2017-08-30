package com.app;

public class Emp {
 private int empId;
 private String empEn;
public Emp(int empId, String empEn) {
	super();
	this.empId = empId;
	this.empEn = empEn;
}
@Override
public String toString() {
	return "Emp [empEn=" + empEn + ", empId=" + empId + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpEn() {
	return empEn;
}
public void setEmpEn(String empEn) {
	this.empEn = empEn;
}
 
}
