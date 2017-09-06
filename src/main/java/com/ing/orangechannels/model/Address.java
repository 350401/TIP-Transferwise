package com.ing.orangechannels.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String id;

	private AddressRequestVO addressRequestVO;

	private AddressResponseVO addressResponseVO;

	// User Id
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AddressRequestVO getAddressRequestVO() {
		return addressRequestVO;
	}

	public void setAddressRequestVO(AddressRequestVO addressRequestVO) {
		this.addressRequestVO = addressRequestVO;
	}

	public AddressResponseVO getAddressResponseVO() {
		return addressResponseVO;
	}

	public void setAddressResponseVO(AddressResponseVO addressResponseVO) {
		this.addressResponseVO = addressResponseVO;
	}

}
