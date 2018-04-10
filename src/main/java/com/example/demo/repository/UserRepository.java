package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	//@Query(name="myQuery")
	List<User> myQuery();
	//@Query(name="queryById")
	//User queryById(@Param(value = "id") Integer id);
}
