package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import com.miguel.david.grupo.parkingmanagerdemo.core.exception.UserExistsException;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserDao;

/**
 * Gestiona todos los usuarios
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 * 
 */
public interface UserService {

  public Iterable<User> getAll();
  public void register(UserDao userDao) throws UserExistsException;
  public boolean userExists(String email);
}
