package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaStudyApplicationTests {
	@Autowired
	UserRepository userDao;

	@Test
	public void contextLoads() {
		List<User> users = userDao.myQuery();
		//User user = userDao.queryById(28);
		users.forEach(x -> System.out.println(x.getPassword()));
		//System.out.println(user.getUserName());
	}

}
