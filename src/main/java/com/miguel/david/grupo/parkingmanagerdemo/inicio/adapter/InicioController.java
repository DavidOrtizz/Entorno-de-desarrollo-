package com.miguel.david.grupo.parkingmanagerdemo.inicio.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

  @GetMapping("/index")
  public String displayInicio(Model model) {
    return "index/index";
  }
}
