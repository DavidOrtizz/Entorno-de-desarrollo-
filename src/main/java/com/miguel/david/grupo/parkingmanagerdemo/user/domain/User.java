
package com.miguel.david.grupo.parkingmanagerdemo.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
  // Atributos que varían para cada objeto
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private String rol;

  // Hace referencia al objeto asignado
  public User(String nombre, String apellido1, String apellido2, String rol) {
    this.nombre = nombre; // El objeto nombre hace referencia a nombre
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.rol = rol;
  }

  // Se encarga de devolver el valor de una propiedad
  public String getNombre() { // Valor de nombre
    return this.nombre;
  }

  // Se encarga de darle un valor a una propiedad
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido1() {
    return this.apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() { //
    return this.apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public String getRol() {
    return this.rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }
}
