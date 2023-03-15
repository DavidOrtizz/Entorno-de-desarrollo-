package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import java.util.List;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;

public interface SorteoService {
  public Iterable<Sorteo> getAll();

  public List<Sorteo> readAll();
}
