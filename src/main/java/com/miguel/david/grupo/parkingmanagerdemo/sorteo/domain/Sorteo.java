package com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/**
 * Es el cuerpo principal de sorteo, donde estan todos los atributos importantes
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 */
@Entity
public class Sorteo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String descripcion;
  private String fecha;
  private Estado estado;
  @ManyToMany
  private Set<Sorteo> includedSorteo;

  /**
   * Son los valores principales de sorteo
   * 
   * @param descripcion se ocupa de guardar la informacion
   * @param fecha       se ocupa de guardar la fecha
   * @param estado      se ocupa de guardar el estado en el que se encuantra
   */
  public Sorteo(String descripcion, String fecha, Estado estado) {
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.estado = estado;
  }

  protected Sorteo() {
    this("", "", null);
  }

  /**
   * Se encarga de devolver el id
   * 
   * @return devuelve el id
   */
  public long getId() {
    return id;
  }

  /**
   * Se encarga de guardar el id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Se encarga de devolver la descripción
   * 
   * @return String devuelve la descripción
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Se encarga de darle valor a descripción
   * 
   * @param descripcion añadimos el valor
   */
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   * Se encarga de devolver la fecha
   * 
   * @return String devuelve la fecha
   */
  public String getFecha() {
    return fecha;
  }

  /**
   * Se encarga de darle valor a la fecha
   * 
   * @param fecha añadimos la fecha
   */
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  /**
   * Se encarga de devolver el estado
   * 
   * @return String devolvemos el estado
   */
  public Estado getEstado() {
    return estado;
  }

  /**
   * Se encarga de darle valor a l estado
   * 
   * @param estado añadimos el estado
   */
  public void setEstado(Estado estado) {
    this.estado = estado;
  }
}
