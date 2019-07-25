package com.adrian.master.backendUserConfiguration.service;

import java.util.List;

import com.adrian.master.backendUserConfiguration.model.User;

 
public interface UserService {
     
    User findById(long id);
     
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    List<User> findAllUsers();
     
    void deleteAllUsers();
     
    boolean isUserExist(User user);
     
}