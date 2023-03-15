package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import java.util.List;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;

public interface UserService {

  public Iterable<User> getAll();

  public List<User> readAll();
}
