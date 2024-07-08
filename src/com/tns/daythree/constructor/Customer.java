package com.tns.daythree.constructor;

public class Customer {
	private String cusName;
	private int cusId;
	private String cusCity;
	//default constructor
	public Customer() {
		System.out.println("Default Constructor");
	}
	//default constructor
	public Customer(String cusName,int cusId, String cusCity) {
		this();//calling default constructor
		System.out.println("Parameterized Constructor");
		this.cusName = cusName;
		this.cusId = cusId;
		this.cusCity = cusCity;
	}
	//getter and setter
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusCity() {
		return cusCity;
	}
	public void setCusCity(String cusCity) {
		this.cusCity = cusCity;
	}
	//to string
	@Override
	public String toString() {
		return "Customer [cusName=" + cusName + ", cusId=" + cusId + ", cusCity=" + cusCity + "]";
	}
	
	

}
