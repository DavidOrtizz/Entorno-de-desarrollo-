package com.miguel.david.grupo.parkingmanagerdemo.sorteo.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteoController {

  @GetMapping("/sorteo")
  public String displaySorteo(Model model) {
    return "sorteo/sorteo";
  }
}