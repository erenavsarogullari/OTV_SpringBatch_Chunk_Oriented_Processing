package com.onlinetechvision.user.service;
 
import java.util.List;
 
import org.springframework.transaction.annotation.Transactional;
 
import com.onlinetechvision.user.User;
import com.onlinetechvision.user.dao.IUserDAO;
 
/**
 *
 * User Service
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class UserService implements IUserService {
 
    IUserDAO userDAO;
 
    /**
     * Adds User
     *
     * @param  User user
     */
    @Transactional(readOnly = false)
    @Override
    public void addUser(User user) {
        getUserDAO().addUser(user);
    }
 
    /**
     * Gets User List
     *
     */
    @Override
    public List<User> getUsers() {
        return getUserDAO().getUsers();
    }
 
    public IUserDAO getUserDAO() {
        return userDAO;
    }
 
    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}