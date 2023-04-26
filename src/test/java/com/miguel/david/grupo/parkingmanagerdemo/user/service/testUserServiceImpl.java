package com.miguel.david.grupo.parkingmanagerdemo.user.service;

import org.junit.jupiter.api.Test;

import com.miguel.david.grupo.parkingmanagerdemo.core.exception.UserExistsException;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.Rol;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.User;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserDao;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class testUserServiceImpl {
  @Test
  void testGetAll() {
    // Arrange
    List<User> userMockedList = new ArrayList<>();
    userMockedList.add(new User("Jose", "Perez", "Muñoz", Rol.PROFESOR));
    userMockedList.add(new User("Mar", "Del Castillo", "Aragón", Rol.ESTUDIANTE));

    UserRepository mockedRepository = mock(UserRepository.class);

    when(mockedRepository.findAll()).thenReturn(userMockedList);
    UserService service = new UserServiceImpl(mockedRepository);

    List<User> actualUsers = (List<User>) service.getAll();

    assertEquals(userMockedList, actualUsers);
  }

  @Test
  void testUserDoesNotExists() {
    // Arrange
    UserRepository mockRepository = mock(UserRepository.class);
    UserDao userDao = new UserDao("david@correo", "David", "Ortiz", "Corchero", Rol.ESTUDIANTE);
    when(mockRepository.findByEmail("david@correo")).thenReturn(null);

    UserService service = new UserServiceImpl(mockRepository);

    // Act
    try {
      service.register(userDao);
    } catch (UserExistsException exception) {
      fail();
    }

    verify(mockRepository).save(any(User.class));
  }

  @Test
  void testUserAlreadyExists(){
    // Arrange
      UserRepository mockRepository = mock(UserRepository.class);
      UserDao userDao = new UserDao("david@correo", "David", "Ortiz", "Corchero", Rol.ESTUDIANTE);
      when(mockRepository.findByEmail("david@correo")).thenReturn(new User("david@correo","David","Ortiz","Corchero",Rol.ESTUDIANTE));
    
      UserService service = new UserServiceImpl(mockRepository);

    // Act
    assertThrows(UserExistsException.class, 
    ()->{
      service.register(userDao);
    });
  }
}
