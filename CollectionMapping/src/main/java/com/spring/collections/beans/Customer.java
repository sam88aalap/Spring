package com.spring.collections.beans;

import java.util.Map;

public class Customer {

	private int customerId;
	private Cart cart;
	private Map<String, Address> addresses;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Map<String, Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cart=" + cart + ", addresses=" + addresses + "]";
	} 
	
	
}
