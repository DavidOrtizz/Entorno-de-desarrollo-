package com.miguel.david.grupo.parkingmanagerdemo.user.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguel.david.grupo.parkingmanagerdemo.user.service.UserService;

/**
 * @author David Ortiz y Miguel Cedric
 * @version 0.0.1
 * @since 12/04/2023
 *  Se ocupa de devolver los datos de los usuarios
 */
@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  
  /**
   * Se ocupa de devolver la lista de usuarios
   * @param model 
   * @return String devielve la lista de usuarios
   */
  @GetMapping("/usuarios")
  public String displayUsers(Model model) {
    model.addAttribute("usuarios", userService.getAll());
    return "user/userlist";
  }
}
