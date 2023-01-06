package com.kalyan.flynow.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyan.flynow.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
