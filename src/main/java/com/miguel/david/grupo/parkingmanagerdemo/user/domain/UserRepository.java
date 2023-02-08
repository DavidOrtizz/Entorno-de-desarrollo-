package com.miguel.david.grupo.parkingmanagerdemo.user.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private ArrayList<User> usuarios;

  public UserRepository() {
    usuarios = new ArrayList<User>();
  }

  public List<User> getAll() {
    this.usuarios.clear();
    this.usuarios.add(new User("Paco", "Bernadeu", "CampNou", "Alumno"));
    return this.usuarios;
  }

  public Iterable<User> findAll() {
    this.usuarios.clear();
    this.usuarios.add(new User("Paco", "Bernadeu", "CampNou", "Alumno"));
    return this.usuarios;
  }
}
