package com.myspace.demo_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LoanRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long loanAmount;
	private java.lang.Integer creditLevel;

	public LoanRequest() {
	}

	public java.lang.Long getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(java.lang.Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.lang.Integer getCreditLevel() {
		return this.creditLevel;
	}

	public void setCreditLevel(java.lang.Integer creditLevel) {
		this.creditLevel = creditLevel;
	}

	public LoanRequest(java.lang.Long loanAmount, java.lang.Integer creditLevel) {
		this.loanAmount = loanAmount;
		this.creditLevel = creditLevel;
	}

}