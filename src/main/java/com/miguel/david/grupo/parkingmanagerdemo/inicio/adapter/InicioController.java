package com.miguel.david.grupo.parkingmanagerdemo.inicio.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InicioController {

  @GetMapping("/static")
  public String displayinicio(Model model) {
    return "index";
  }
}
