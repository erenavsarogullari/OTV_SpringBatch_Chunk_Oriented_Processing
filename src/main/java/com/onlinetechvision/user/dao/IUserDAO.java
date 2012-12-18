package com.onlinetechvision.user.dao;

import java.util.List;

import com.onlinetechvision.user.User;
 
/**
 * User DAO Interface
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public interface IUserDAO {
 
    /**
     * Adds User
     *
     * @param  User user
     */
    void addUser(User user);
 
    /**
     * Gets User List
     *
     */
    List<User> getUsers();
}
