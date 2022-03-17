package com.te.trainee;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee  implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String email;
private String pwd;
private String number;
public Trainee() {
	super();
}
public Trainee(int id, String email, String pwd, String number) {
	super();
	this.id = id;
	this.email = email;
	this.pwd = pwd;
	this.number = number;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
 
}
