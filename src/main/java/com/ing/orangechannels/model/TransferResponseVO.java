package com.ing.orangechannels.model;

import com.ing.orangechannels.model.User;

public class TransferResponseVO {

	// Unique Transfer Id, assigned by TransferWise
	private Integer ID;
	
	// Target recipient account id. Person receiving the funds.
	private Integer targetAccount;
	// Refund recipient account id. Used only for refund purposes.
	private Integer sourceAccount;
	// quote Id
	private Integer quoteId;
	// Transfer current status
	private String status;
	// reference
	private String reference;
	// Exchange rate used for transfer
	private Double rate;
	// Timestamp when transfer is created // Format ": "2017-03-14 15:25:51",
	private String createdDate;
	// business: User profile id - only in case of businesses
	private String business;
	// transferRequest :Link to 'Request money' transfer id
	private String transferRequest;
	// Transfer response details
	private TransferResponseDetails transferResponseDetails;
	// hasActiveIssues: Are there any pending issues which stop executing the
	// transfer.
	private Boolean hasActiveIssues;
	// customerTransactionId: UUID format unique identifier assinged by
	// customer. Used for idempotency check purposes.
	private String customerTransactionId;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(Integer targetAccount) {
		this.targetAccount = targetAccount;
	}

	public Integer getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Integer sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Integer getQuoteID() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getTransferRequest() {
		return transferRequest;
	}

	public void setTransferRequest(String transferRequest) {
		this.transferRequest = transferRequest;
	}

	public TransferResponseDetails getTransferResponseDetails() {
		return transferResponseDetails;
	}

	public void setTransferResponseDetails(TransferResponseDetails transferResponseDetails) {
		this.transferResponseDetails = transferResponseDetails;
	}

	public Boolean getHasActiveIssues() {
		return hasActiveIssues;
	}

	public void setHasActiveIssues(Boolean hasActiveIssues) {
		this.hasActiveIssues = hasActiveIssues;
	}

	public String getCustomerTransactionId() {
		return customerTransactionId;
	}

	public void setCustomerTransactionId(String customerTransactionId) {
		this.customerTransactionId = customerTransactionId;
	}

}
