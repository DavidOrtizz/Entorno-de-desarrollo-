package com.miguel.david.grupo.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Estado;
import com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain.Sorteo;

@SpringBootTest
public class testSorteo {

  private Sorteo sorteo;

  @BeforeEach
  public void sorteo() {
    this.sorteo = new Sorteo("Has ganado", "22/02/2023",Estado.TERMINADO);
  }

  @Test
  public void check_sorteo_descripcion() {
    // Arranque
    String expected = "Has ganado";

    // Act
    String actual = sorteo.getDescripcion();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void check_sorteo_fecha() {
    // Arranque
    String expected = "22/02/2023";

    // Act
    String actual = sorteo.getFecha();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void check_sorteo_estado() {
    // Arranque
    Estado expected = Estado.TERMINADO;

    // Act
    Estado actual = sorteo.getEstado();

    // Assert
    assertEquals(expected, actual);
  }
}
