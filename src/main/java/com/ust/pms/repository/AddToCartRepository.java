package com.ust.pms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ust.pms.model.AddToCart;

@Repository
public interface AddToCartRepository extends CrudRepository<AddToCart,Integer>{

}
