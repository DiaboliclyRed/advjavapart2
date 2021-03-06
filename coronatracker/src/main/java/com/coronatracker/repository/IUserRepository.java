
package com.coronatracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coronatracker.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.username =:username")
	User findUserByUsername(String username);
	
}