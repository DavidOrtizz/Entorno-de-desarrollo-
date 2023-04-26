
package com.miguel.david.grupo.parkingmanagerdemo.user.domain;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/**
 * Se ocupade de guardar los datos de los usuarios
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 * 
 */
@Entity
public class User {
  // Atributos que varían para cada objeto
  @Id
  private long id;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(unique = true)
  private String email;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private Rol rol;
  @ManyToMany(mappedBy = "includedSorteo")
  private Set<User> includedUser;

  // Hace referencia al objeto asignado
  public User(String nombre, String apellido1, String apellido2, Rol rol) {
    this.nombre = nombre; // El objeto nombre hace referencia a nombre
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.rol = rol;
  }

  public User() {
    this("", "", "", null);
  }

  /**
   * Se encarga de devolver el valor de una propiedad
   * 
   * @param nombre Valor de nombre
   * @return String devuelve el nombre
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * Se encarga de darle un valor al nombre
   * 
   * @param nombre nombre asignado
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Se encarga de devolver el primer apellido
   * 
   * @return String devuelve el primer apellido
   */
  public String getApellido1() {
    return this.apellido1;
  }

  /**
   * Se encarga de darle valor al primer apellido
   * 
   * @param apellido1 asigna el primer apellido
   */
  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  /**
   * Se encarga de devolver el segundo apellido
   * 
   * @param apellido2 segundo apellido asignado
   * @return String devuelve el segundo apellido
   */
  public String getApellido2() { //
    return this.apellido2;
  }

  /**
   * Se encarga de darle valor al segundo apellido
   * 
   * @param apellido2 valor del segundo apellido
   */
  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  
  /**
   * Devuelve el rol
   *  
   * @return devuelve Rol
   */
  public Rol getRol() {
    return rol;
  }
  /**
   * Guarda el valor de rol
   *  
   */
  public void setRol(Rol rol) {
    this.rol = rol;
  }
}
