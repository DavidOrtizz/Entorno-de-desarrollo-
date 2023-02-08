package com.miguel.david.grupo.parkingmanagerdemo.sorteo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sorteoController {
  private UserRepository repository = new UserRepository();

  @GetMapping("/sorteo")
  public String displayUsers(Model model) {
   model.addAttribute("usuarios", repository.getAll());
    return "sorteo/sorteo";
  }
}