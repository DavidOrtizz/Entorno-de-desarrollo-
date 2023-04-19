package com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Es donde se van a guardar los datos de sorteo
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 */
@Repository
public class SorteoRepository {

  private ArrayList<Sorteo> sorteos;

  /**
   * Se crea el array de sorteo
   */
  public SorteoRepository() {
    sorteos = new ArrayList<Sorteo>();
  }

  /**
   * Se ocupa de devolver todos los sorteos
   * 
   * @return List<Sorteo>
   * 
   */
  public List<Sorteo> getAll() {
    this.sorteos.add(new Sorteo("Descripcion", "14/02/2047",Estado.NUEVO));
    return this.sorteos;
  }

  /**
   * Se encarga de recorrer todos los elementos sorteo
   * 
   * @return Iterable<Sorteo>
   */
  public Iterable<Sorteo> findAll() {
    this.sorteos.add(new Sorteo("Descripcion", "14/02/2047", Estado.TERMINADO));
    return this.sorteos;
  }
}
