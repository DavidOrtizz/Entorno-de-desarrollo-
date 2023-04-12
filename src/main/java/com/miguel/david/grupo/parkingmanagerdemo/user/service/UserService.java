package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;

/**
 * @author David Ortiz y Miguel Cedric
 * @version 0.0.1
 * Devuelve todos los usuarios
 */
public interface UserService {

  public Iterable<User> getAll();
}
