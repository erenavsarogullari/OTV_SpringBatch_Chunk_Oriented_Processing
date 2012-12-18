package com.onlinetechvision.item;

import java.util.Locale;

import org.springframework.batch.item.ItemProcessor;

import com.onlinetechvision.user.User;

/**
 * TestProcessor Class is created to process items.
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public class TestProcessor implements ItemProcessor<User, User>  {

	/**
     * Processes items one by one
     *
     * @param User user
     * @return User 
     * @throws Exception
     *
     */
	@Override
	public User process(User user) throws Exception {
		user.setName(user.getName().toUpperCase(Locale.ENGLISH));
		user.setSurname(user.getSurname().toUpperCase(Locale.ENGLISH));
		return user;
	}

}
