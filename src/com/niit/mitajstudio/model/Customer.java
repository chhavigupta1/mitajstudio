  package com.niit.mitajstudio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer implements Serializable
{
@Id
@GeneratedValue
(strategy=GenerationType.IDENTITY)
private int userId; 
/*@Column(unique=true)*/
private String firstname;
private String lastname;
private String username;
private String password;
private String email;
private long phone; 
/**
 * @return the userId     
 */
public int getuserId() {
	return userId;
}
/** 
 * @param userId the userId to set
 */
public void setuserId(int userId) {
	this.userId = userId;
}
/**
 * @return the firstname
 */
public String getFirstname() {
	return firstname;
}
/**
 * @param firstname the firstname to set
 */
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
/**
 * @return the lastname
 */
public String getLastname() {
	return lastname;
}
/**
 * @param lastname the lastname to set
 */
public void setLastname(String lastname) {
	this.lastname = lastname;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the phone
 */
public long getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(long phone) {
	this.phone = phone;
}


}