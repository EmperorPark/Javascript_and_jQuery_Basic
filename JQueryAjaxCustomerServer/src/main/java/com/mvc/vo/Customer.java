package com.mvc.vo;


public class Customer implements Comparable<Customer>{
	
	private String num;
	private String name;	
	private String address;		

	public Customer() {}		
	public Customer(String num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Customer o) {		
		return Integer.parseInt(this.getNum())- Integer.parseInt(o.getNum());
	}
	
	
	
}
