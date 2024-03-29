package com.miguel.david.grupo.parkingmanagerdemo.user.service;
import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Iterable<User> getAll() {
    return this.userRepository.findAll();
  }

}