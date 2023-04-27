package com.miguel.david.grupo.parkingmanagerdemo.user.adapter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.miguel.david.grupo.parkingmanagerdemo.core.exception.UserExistsException;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.Rol;
import com.miguel.david.grupo.parkingmanagerdemo.user.domain.UserDao;
import com.miguel.david.grupo.parkingmanagerdemo.user.service.UserService;

import jakarta.validation.Valid;

/**
 * Se ocupa de devolver los datos de los usuarios
 * 
 * @author David Ortiz y Miguel Cedric
 * @version 0.0.1
 * @since 12/04/2023
 */
@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  /**
   * Se ocupa de devolver la lista de usuarios
   * 
   * @param model
   * @return String devielve la lista de usuarios
   */
  @GetMapping("/usuarios")
  public String displayUsers(Model model) {
    model.addAttribute("usuarios", userService.getAll());
    return "user/userlist";
  }

  @GetMapping("/newUser")
  public String showUserCreateForm(Model model) {
    addRolSelectList(model);
    UserDao userDao = new UserDao();
    model.addAttribute("userDao", userDao);
    return "user/createform";
  }

  private void addRolSelectList(Model model) {
    List<Rol> roles = Arrays.asList(Rol.values());
    model.addAttribute("roles", roles);
  }

  @PostMapping("/newUser")
  public String createUser(@Valid @ModelAttribute("userDao") UserDao userDao, BindingResult bindingResult,
      Model model) {
    // Si algún error de validacion automatica con UserDao
    if (bindingResult.hasErrors()) {
      model.addAttribute("userDao", userDao);
      addRolSelectList(model);
      return "user/userform";
    }

    try {
      this.userService.register(userDao);
    } catch (UserExistsException exception) { // Cuando ya existe un usuario con el correo
      model.addAttribute("userDao", userDao);
      addRolSelectList(model);
      bindingResult.reject("email", "Ya existe el usuario con el correo");
      return "user/userform";
    }
    return "redirect:/users";
  }
}
