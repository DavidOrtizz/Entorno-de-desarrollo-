package com.miguel.david.grupo.parkingmanagerdemo.sorteo.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Se ocupa de devolver los datos de sorteo
 * 
 * @author David Ortiz Corchero y Miguel Cedric Villoslada Boulanger
 * @version 0.0.1
 * @since 12/04/2023
 */
@Controller
public class SorteoController {

  /**
   * Se encarga de enviar los datos a sorteo
   * 
   * @param model
   * @return String devuelve la informacion de sorteo
   */
  @GetMapping("/sorteo")
  public String displaySorteo(Model model) {
    return "sorteo/sorteo";
  }
}