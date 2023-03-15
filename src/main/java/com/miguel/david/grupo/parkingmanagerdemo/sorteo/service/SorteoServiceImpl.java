package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.SorteoRepository;

@Service
public class SorteoServiceImpl implements SorteoService {

  private SorteoRepository sorteoRepository;

  public SorteoServiceImpl(SorteoRepository sorteoRepository) {
    this.sorteoRepository = sorteoRepository;
  }

  public Iterable<Sorteo> getAll() {
    return this.sorteoRepository.findAll();
  }

}
