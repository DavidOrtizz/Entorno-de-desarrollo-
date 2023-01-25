package com.miguel.david.grupo.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

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
}
