package com.pj.wallet.server.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pj.wallet.server.entity.UserSession;


public interface UserSessionRepository extends CrudRepository<UserSession, Long>, JpaSpecificationExecutor<UserSession>{

	@Query("select s from USER_SESSION s where s.sessionId=?1")
	UserSession findUserSessionBySessionId(String sessionId);
}
