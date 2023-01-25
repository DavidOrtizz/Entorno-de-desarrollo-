package com.miguel.david.grupo.parkingmanagerdemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  private UserRepository repository = new UserRepository();

  @GetMapping("/usuarios")
  public String displayUsers(Model model) {
    model.addAttribute("usuarios", repository.getAll());
    return "listausuarios";
  }
}