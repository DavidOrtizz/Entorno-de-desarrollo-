package com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain;

/**
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 */
public class Sorteo {
  private String descripcion;
  private String fecha;
  private String estado;

  /**
   * Son los valores principales de sorteo
   * 
   * @param descripcion se ocupa de guardar la informacion
   * @param fecha       se ocupa de guardar la fecha
   * @param estado      se ocupa de guardar el estado en el que se encuantra
   */
  public Sorteo(String descripcion, String fecha, String estado) {
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.estado = estado;
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
  public String getEstado() {
    return estado;
  }

  /**
   * Se encarga de darle valor a l estado
   * 
   * @param estado añadimos el estado
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }
}
