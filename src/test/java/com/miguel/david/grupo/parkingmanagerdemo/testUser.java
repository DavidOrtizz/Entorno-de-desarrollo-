package com.miguel.david.grupo.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.miguel.david.grupo.parkingmanagerdemo.user.User;

@SpringBootTest
public class testUser {

  private User user;

  @BeforeEach
  public void user() {
    this.user = new User("David", "Ortiz", "Corchero", "Alumno");
  }

  @Test
  public void check_user_nombre() {
    // Arranque
    String expected = "David";

    // Act
    String actual = user.getnombre();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void check_user_apellido1() {
    // Arranque
    String expected = "Ortiz";

    // Act
    String actual = user.getapellido1();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void check_user_apellido2() {
    // Arranque
    String expected = "Corchero";

    // Act
    String actual = user.getapellido2();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void check_user_rol() {
    // Arranque
    String expected = "Alumno";

    // Act
    String actual = user.getrol();

    // Assert
    assertEquals(expected, actual);
  }
}
