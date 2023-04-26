package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.core.exception.UserExistsException;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

/**
 * Devuelve toda la informacion de los usuarios
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 * 
 */
@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  @Override
  /**
   * Devuelve toda la informacion de los usuarios
   * 
   * @return Iterable<User> Devuelve toda la informacion de los usuarios
   */
  public Iterable<User> getAll() {
    return this.userRepository.findAll();
  }

  public void register(com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserDao UserDao) throws UserExistsException{
    if (userExists(UserDao.getEmail())) {
      throw new UserExistsException();
    }
    User user =new User();
    BeanUtils.copyProperties(UserDao, user);
    this.userRepository.save(user);
  }


  public boolean userExists(String email) {
     return this.userRepository.findByEmail(email) != null ? true : false;
  }

}