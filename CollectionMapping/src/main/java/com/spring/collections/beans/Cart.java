package com.spring.collections.beans;

import java.util.Set;

public class Cart {

	private int cartId;
	private Set<Product> products;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", products=" + products + "]";
	}
	
}
