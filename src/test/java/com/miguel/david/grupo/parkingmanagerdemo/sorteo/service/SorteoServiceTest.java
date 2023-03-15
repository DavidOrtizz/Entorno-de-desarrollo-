package com.miguel.david.grupo.parkingmanagerdemo.sorteo.service;

import org.junit.jupiter.api.Test;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.SorteoRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class SorteoServiceTest {
  @Test
  void testGetAll() {
   /* List<Sorteo> sorteoMockedList = new ArrayList<>();
    sorteoMockedList.add(new Sorteo("Hola", "15/03/2023", "Puedes entrar"));
    sorteoMockedList.add(new Sorteo("Ala", "15/03/2023", "Puedes entrar"));

    SorteoRepository mockedRepository = mock(SorteoRepository.class);

    when(mockedRepository.findAll()).thenReturn(sorteoMockedList);
    SorteoService service = new SorteoServiceImpl(mockedRepository);

    List<Sorteo> actualSorteo = service.getAll();

    assertEquals(sorteoMockedList, actualSorteo);*/
  }
}
