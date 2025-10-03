package com.example.demo.controllers;

import com.example.demo.model.MusicalPiece;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

/*
 * In this code, we define a Spring Boot controller with multiple routes,
 * each route corresponds to a method that returns the name of the view to be rendered.
 * The controller also adds attributes to the model to be used in the views.
 */

@Controller
public class DemoController {

    @GetMapping({"/", "/index", "/home"})
    public String showIndex(Model model) {
        model.addAttribute("year", LocalDate.now().getYear());
        return "indexView";
    }


    //here MusicalPiece is used to create a list of musical pieces and pass it to the view
    @GetMapping("/repertorio")
    public String showRepertorio(Model model) {
        List<MusicalPiece> pieces = List.of(
                new MusicalPiece("Nocturne Op.9 No.2", "Chopin", 1832, "Solo piano"),
                new MusicalPiece("Piano Concerto No.1", "Chopin", 1830, "Piano concert"),
                new MusicalPiece("Ballade No.1 in G minor", "Chopin", 1835, null)
        );

        model.addAttribute("pieces", pieces);
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
