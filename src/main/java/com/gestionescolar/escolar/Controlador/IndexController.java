package com.gestionescolar.escolar.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String mostrarDashboard() {
        return "index";
    }
}

