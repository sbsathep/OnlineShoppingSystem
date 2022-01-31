package com.UserModule;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.onlineShopping.Model.User;
import com.onlineShopping.Repository.UserRepo;
import com.onlineShopping.Service.IUser;

@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineShoppingSystemApplicationTests 
{
	@Autowired
	private IUser service;
	
	@MockBean
	private UserRepo repository;

	@Test
	public void getUserAddTest() 
	{
		when(repository.findAll()).thenReturn(
				Stream.of(new User(45, "Vinay", "Shirdi","vinay2426@gmail.com" , 904928 ,"vinay1244", "vinay1244"),
						new User(43,"Mintu","ladakh","mintu24@gmail.com",904928,"mintu1234","mintu1234"))
				.collect(Collectors.toList()));
		
		assertEquals(1,service.findAllUser().size());
	}

	
	/*
	 * @Test public void saveUser() { User user=new
	 * User(125,"Delhi","Vijay",123456787,"vijay987","vijay987","vijay123");
	 * when(repository.save(user)).thenReturn(user);
	 * 
	 * 
	 * assertEquals(user, service.addUser(user)); }
	 */
}
