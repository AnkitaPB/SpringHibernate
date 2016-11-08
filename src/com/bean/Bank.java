package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
@Entity
@Table(name="bank")
public class Bank implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "bid")
	private int bid;
	
	@NotBlank
	@Column(name= "bname")
	private String bankName;

	@NotBlank
	@Column(name= "accno")
	private String accountNumber;
	
	@NotBlank
	@Column(name= "ssn")
	private String ssn;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	

}
