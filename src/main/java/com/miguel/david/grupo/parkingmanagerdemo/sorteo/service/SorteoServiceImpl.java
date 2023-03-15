package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.SorteoRepository;

@Service
public class SorteoServiceImpl implements SorteoService {

  private SorteoRepository sorteoRepository;

  @Autowired
  public SorteoServiceImpl(SorteoRepository sorteoRepository) {
    this.sorteoRepository = sorteoRepository;
  }

  public Iterable<Sorteo> getAll() {
    return this.sorteoRepository.findAll();
  }

  @Override
  public List<Sorteo> readAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'readAll'");
  }
}
