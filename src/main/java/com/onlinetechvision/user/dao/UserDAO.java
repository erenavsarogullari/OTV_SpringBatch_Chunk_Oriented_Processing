package com.onlinetechvision.user.dao;

import java.util.List;
  
import org.hibernate.SessionFactory;

import com.onlinetechvision.user.User;
 
/**
 * User DAO
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */ 
public class UserDAO implements IUserDAO {
 
    private SessionFactory sessionFactory;
 
    /**
     * Gets Hibernate Session Factory
     *
     * @return SessionFactory - Hibernate Session Factory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    /**
     * Sets Hibernate Session Factory
     *
     * @param SessionFactory - Hibernate Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    /**
     * Adds User
     *
     * @param  User user
     */
    @Override
    public void addUser(User user) {
        getSessionFactory().getCurrentSession().save(user);
    }
 
    /**
     * Gets User List
     *
     * @return List - User list
     */
    @SuppressWarnings({ "unchecked" })
	@Override
    public List<User> getUsers() {
        List<User> list = getSessionFactory().getCurrentSession().createQuery("from User").list();
        return list;
    }
 
}
