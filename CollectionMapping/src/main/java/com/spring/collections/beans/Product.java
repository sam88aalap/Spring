package com.spring.collections.beans;

public class Product {
	private int productId;
	private String productName;
	private double cost;
	public Product(int productId, String productName, double cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";
	}
	

}
