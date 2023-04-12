package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;

/**
 * Se encarga de comprobar tosos los sorteos
 * 
 * @author David Ortiz Corchero y Miguel Cedric Villoslada Boulanger
 * @version 0.0.1
 * @since 12/04/2023
 */
public interface SorteoService {
  public Iterable<Sorteo> getAll();
}
