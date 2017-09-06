package com.ing.orangechannels.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	// User name
	private String username;
	// password
	private String password;
	// first name
	private String firstName;
	// last name
	private String lastName;
	// middle name
	private String middleName;
	// mobile number
	private long mobileNumber;
	// email
	private String email;
	// Set of beneficiary addresses per user
	private Set<Address> address;
	// i-ban number
	private String ibanNum;
	// Current amount
	private double curAmount;
	// available amount
	private double avalAmount;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public String getIbanNum() {
		return ibanNum;
	}

	public void setIbanNum(String ibanNum) {
		this.ibanNum = ibanNum;
	}

	public double getCurAmount() {
		return curAmount;
	}

	public void setCurAmount(double curAmount) {
		this.curAmount = curAmount;
	}

	public double getAvalAmount() {
		return avalAmount;
	}

	public void setAvalAmount(double avalAmount) {
		this.avalAmount = avalAmount;
	}

}
