package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import org.junit.jupiter.api.Test;

import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    UserRepository mockedRepository = mock(UserRepository.class);

    when(mockedRepository.findAll()).thenReturn(userMockedList);
    UserService service = new UserServiceImpl(mockedRepository);

    List<User> actualUsers = service.readAll();

    assertEquals(userMockedList, actualUsers);
  }
}
