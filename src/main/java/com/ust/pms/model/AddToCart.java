package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class AddToCart {

	@Id
	private int addToCartId;
	
	private Integer userId;

	private Integer productId;
	
	
	
	
	

	public AddToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddToCart(int addToCartId, Integer userId, Integer productId) {
		super();
		this.addToCartId = addToCartId;
		this.userId = userId;
		this.productId = productId;
	}

	public int getAddToCartId() {
		return addToCartId;
	}

	public void setAddToCartId(int addToCartId) {
		this.addToCartId = addToCartId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	

	@Override
	public String toString() {
		return "AddToCart [addToCartId=" + addToCartId + ", userId=" + userId + ", productId=" + productId + "]";
	}
		
}
