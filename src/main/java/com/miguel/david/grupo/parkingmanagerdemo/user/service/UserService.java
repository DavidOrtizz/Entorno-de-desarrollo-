package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.*;

public interface UserService {

  public Iterable<User> getAll();
}
