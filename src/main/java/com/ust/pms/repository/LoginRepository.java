package com.ust.pms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ust.pms.model.User;

@Repository
public interface LoginRepository extends CrudRepository<User,Integer>{	
	
	public User findByUserName(String userName);

}
