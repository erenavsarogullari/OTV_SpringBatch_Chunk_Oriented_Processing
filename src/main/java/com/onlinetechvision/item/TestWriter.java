package com.onlinetechvision.item;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.onlinetechvision.user.User;
import com.onlinetechvision.user.service.IUserService;

/**
 * TestWriter Class is created to write items to DB, memory etc...
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public class TestWriter implements ItemWriter<User> {

	private IUserService userService;
	
	/**
     * Writes items via list
     *
     * @throws Exception
     *
     */
	@Override
	public void write(List<? extends User> userList) throws Exception {
		for(User user : userList) {
			getUserService().addUser(user);
		}
		System.out.println("User List : " + getUserService().getUsers());
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
