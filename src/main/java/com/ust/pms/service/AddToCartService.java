package com.ust.pms.service;

import com.ust.pms.model.AddToCart;

public interface AddToCartService {
	
	public String addItem(AddToCart addToCart);
	
	public String removeItem(int addToCartId);

}
