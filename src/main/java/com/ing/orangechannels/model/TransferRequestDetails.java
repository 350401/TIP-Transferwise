package com.ing.orangechannels.model;

public class TransferRequestDetails {

	// Reference
	private String reference;
	// Source of Funds
	private String sourceOfFunds;
	// Source of funds other
	private String sourceOfFundsOther;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSourceOfFunds() {
		return sourceOfFunds;
	}

	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}

	public String getSourceOfFundsOther() {
		return sourceOfFundsOther;
	}

	public void setSourceOfFundsOther(String sourceOfFundsOther) {
		this.sourceOfFundsOther = sourceOfFundsOther;
	}

}
