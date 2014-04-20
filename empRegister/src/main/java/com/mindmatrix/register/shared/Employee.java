package com.mindmatrix.register.shared;

public class Employee {
	
	String name;
	Integer age;
	String address;
	String emailId;
	Integer phoneNo;
	
public Employee(String name,Integer age,String address,String emailId,Integer phoneNo)
{
	this.name=name;
	this.age=age;
	this.address=address;
	this.emailId=emailId;
	this.phoneNo=phoneNo;
	
}

public Integer getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(Integer phoneNo) {
	this.phoneNo = phoneNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}
}
