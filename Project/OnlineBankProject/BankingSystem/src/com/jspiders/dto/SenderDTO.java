package com.jspiders.dto;

public class SenderDTO {
private String tid;
private String accountNo;
private String description;
private double balance;
private String tDate;
public String getTid() {
	return tid;
}
public void setTid(String tid) {
	this.tid = tid;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String gettDate() {
	return tDate;
}
public void settDate(String tDate) {
	this.tDate = tDate;
}
}
