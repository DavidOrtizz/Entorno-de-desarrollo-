package com.miguel.david.grupo.parkingmanagerdemo.user.service;
import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

/**
 * @author David Ortiz y Miguel Cedric
 * @version 0.0.1
 * Devuelve toda la informacion de los usuarios
 */
@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  
  /** 
   * Devuelve toda la informacion de los usuarios
   * @return Iterable<User> Devuelve toda la informacion de los usuarios
   */
  public Iterable<User> getAll() {
    return this.userRepository.findAll();
  }

}