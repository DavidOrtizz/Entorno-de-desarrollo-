package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.SorteoRepository;

/**
 * Se encarga de mostrar toda la información de sorteo
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 */
@Service
public class SorteoServiceImpl implements SorteoService {

  private SorteoRepository sorteoRepository;

  /**
   * Se ocupa de añadir la informacion de sorteo dentro del array
   * 
   * @param sorteoRepository
   */
  public SorteoServiceImpl(SorteoRepository sorteoRepository) {
    this.sorteoRepository = sorteoRepository;
  }

  /**
   * Se encarga de devolver todos los sorteos
   * 
   * @return Iterable<Sorteo>
   */
  public Iterable<Sorteo> getAll() {
    return this.sorteoRepository.findAll();
  }

}
