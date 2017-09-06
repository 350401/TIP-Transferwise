package com.ing.orangechannels.model;

public class TransferRequestVO {

	// Target recipient account id. Person receiving the funds.
	private Integer targetAccount;
	// QuoteId (Mandatory)
	private Integer quoteId;

	// Refund recipient account id. Used only for refund purposes.

	private Integer sourceAccount;

	/**
	 * UUID - unique identifier of transfer assigned by customer. Used for
	 * idempotency check purposes.
	 * 
	 * The purpose of the customerTransactionId is to prevent the creation of
	 * duplicate transfers in case of transient failures when submitting
	 * requests
	 */
	private String customerTransactionId;

	// Optional Transfer details
	private TransferRequestDetails transferDetails;

	public Integer getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(Integer targetAccount) {
		this.targetAccount = targetAccount;
	}

	public Integer getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public TransferRequestDetails getTransferDetails() {
		return transferDetails;
	}

	public void setTransferDetails(TransferRequestDetails transferDetails) {
		this.transferDetails = transferDetails;
	}

	public String getCustomerTransactionId() {
		return customerTransactionId;
	}

	public void setCustomerTransactionId(String customerTransactionId) {
		this.customerTransactionId = customerTransactionId;
	}

}
