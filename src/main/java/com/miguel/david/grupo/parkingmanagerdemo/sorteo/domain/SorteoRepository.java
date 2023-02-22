package com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SorteoRepository {

  private ArrayList<Sorteo> sorteos;

  public SorteoRepository() {
    sorteos = new ArrayList<Sorteo>();
  }

  public List<Sorteo> getAll() {
    this.sorteos.clear();
    this.sorteos.add(new Sorteo("Descripcion", "14/02/1234", "Hola"));
    return this.sorteos;
  }

  public Iterable<Sorteo> findAll() {
    this.sorteos.clear();
    this.sorteos.add(new Sorteo("Descripcion", "14/02/1234", "Hola"));
    return this.sorteos;
  }
}
