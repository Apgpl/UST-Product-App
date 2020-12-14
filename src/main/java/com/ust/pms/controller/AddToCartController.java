package com.ust.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.pms.model.AddToCart;
import com.ust.pms.service.AddToCartService;

@RestController
@RequestMapping("addtocart")
@CrossOrigin(origins="http://localhost:4200")

public class AddToCartController {
	
	@Autowired
	AddToCartService addToCartService;
	
	@PostMapping()
	public ResponseEntity<String> addItem(@RequestBody AddToCart addToCart) {
		System.out.println(addToCart);
		addToCartService.addItem(addToCart);
		return new ResponseEntity<String>("Item Added Successfully", HttpStatus.OK);
	}
	
	
	// delete
		@DeleteMapping("/{addToCartId}")
		public ResponseEntity<String> deleteItem(@PathVariable("addToCartId") Integer addToCartId) {
			System.out.println( "Delete controller");
			
			
			addToCartService.removeItem(addToCartId);
			return new ResponseEntity<String>("Deleted Ok", HttpStatus.OK);		
			
//			
//			if (addToCartService.isProductExists(addToCartId)) {
//				productService.deleteProduct(productId);
//				return new ResponseEntity<String>("Deleted Ok", HttpStatus.OK);
//	 
//			} else {
//				return new ResponseEntity<String>("Deleted not ", HttpStatus.NO_CONTENT);
//	 
//			}
//			
			
			
		}
	
	

}
