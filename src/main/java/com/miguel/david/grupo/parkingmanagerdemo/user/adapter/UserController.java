package com.miguel.david.grupo.parkingmanagerdemo.user.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguel.david.grupo.parkingmanagerdemo.user.service.UserService;

@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/usuarios")
  public String displayUsers(Model model) {
    model.addAttribute("usuarios", userService.getAll());
    return "user/listausuarios";
  }
}
