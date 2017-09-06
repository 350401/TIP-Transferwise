package com.ing.orangechannels.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transfer {

	private String id;

	private TransferRequestVO transferRequestVO;

	private TransferResponseVO transferResponseVO;

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

	public TransferRequestVO getTransferRequestVO() {
		return transferRequestVO;
	}

	public void setTransferRequestVO(TransferRequestVO transferRequestVO) {
		this.transferRequestVO = transferRequestVO;
	}

	public TransferResponseVO getTransferResponseVO() {
		return transferResponseVO;
	}

	public void setTransferResponseVO(TransferResponseVO transferResponseVO) {
		this.transferResponseVO = transferResponseVO;
	}

}
