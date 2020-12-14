package com.ust.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.AddToCart;
import com.ust.pms.repository.AddToCartRepository;

@Service
public class AddToCartServiceImpl implements AddToCartService {
	
	@Autowired
	AddToCartRepository addToCartRepository;

	@Override
	public String addItem(AddToCart addToCart) {
		// TODO Auto-generated method stub
		
		if(addToCart.getProductId()!= null && addToCart.getUserId()!= null ) {
			
			addToCartRepository.save(addToCart);
			
			return "Item Added Successfully";			
		}	else {
			return "Item Not Added Successfully";
		}	
	}

	@Override
	public String removeItem(int addToCartId) {
		// TODO Auto-generated method stub	
			
			addToCartRepository.deleteById(addToCartId);
			
			return "Item Removed Successfully";				
			
			//	}	else {
			//		return "Item Removed Not Successfully";
			//	}	
			//		
	}

}
