package com.pj.wallet.server.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pj.wallet.server.entity.User;


public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {

	@Query("select u from USER u where u.userName=?1")
	User findByUserName(String username);
}
