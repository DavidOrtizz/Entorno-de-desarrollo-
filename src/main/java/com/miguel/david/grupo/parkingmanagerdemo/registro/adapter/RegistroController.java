package com.miguel.david.grupo.parkingmanagerdemo.registro.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguel.david.grupo.parkingmanagerdemo.registro.service.RegistroService;

@Controller
public class RegistroController {

  private RegistroService registroService;

  public RegistroController(RegistroService registroService) {
    this.registroService = registroService;
  }

  @GetMapping("/registro")
  public String displayResgistro(Model model) {
    model.addAttribute("registro", registroService.getAll());
    return "registro/registro"; 
  }
}
