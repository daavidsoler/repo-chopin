package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
    /**
     * method to handle requests to the root, index, and home URLs.
     * @return the name of the view to be rendered
     */
    @GetMapping({"/", "/index", "/home"})
    public String showIndex() {
        return "indexView";
    }

    @GetMapping("/repertorio")
    public String showRepertorio() {
        return "repertorioView";
    }

    @GetMapping("/galeria")
    public String showGaleria() {
        return "galeriaView";
    }

   @GetMapping("/enlaces")
   public String showEnlaces() {
       return "enlacesView";
   }
   
    
}
