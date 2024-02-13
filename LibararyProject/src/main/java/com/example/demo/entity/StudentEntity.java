package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Libarary")
public class StudentEntity {
@Id	
@GeneratedValue
private int studentId;
private String studentName;
private String studentAddress;
private int phno;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "libarary_Entity_reflibId")
private LibararyEntity libarary;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public LibararyEntity getLibarary() {
	return libarary;
}
public void setLibarary(LibararyEntity libarary) {
	this.libarary = libarary;
}
public StudentEntity(int studentId, String studentName, String studentAddress, int phno, LibararyEntity libarary) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.phno = phno;
	this.libarary = libarary;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
			+ studentAddress + ", phno=" + phno + ", libarary=" + libarary + "]";
}



}
