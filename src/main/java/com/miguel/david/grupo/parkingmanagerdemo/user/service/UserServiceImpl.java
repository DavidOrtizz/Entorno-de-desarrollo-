package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Iterable<User> getAll() {
    return this.userRepository.findAll();
  }

  @Override
  public List<User> readAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'readAll'");
  }
}