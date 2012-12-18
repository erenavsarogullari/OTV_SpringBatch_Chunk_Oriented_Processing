package com.onlinetechvision.user.service;

import java.util.List;

import com.onlinetechvision.user.User;
 
/**
 *
 * User Service Interface
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public interface IUserService {
 
    /**
     * Adds User
     *
     * @param  User user
     */
    void addUser(User user);
 
    /**
     * Gets User List
     *
     * @return List - User list
     */
    List<User> getUsers();
}