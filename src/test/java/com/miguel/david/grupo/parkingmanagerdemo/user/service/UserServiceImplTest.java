package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import org.junit.jupiter.api.Test;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImplTest {
  @Test
  void testGetAll() {
    // Arrange
    List<User> userMockedList = new ArrayList<>();
    userMockedList.add(new User("Jose", "Perez", "Muñoz", "Alumno"));
    userMockedList.add(new User("Mar", "Del Castillo", "Aragón", "Alumno"));
  }
}
