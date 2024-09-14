package com.gestionescolar.escolar.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionescolar.escolar.modelo.Aulas;
import com.gestionescolar.escolar.repositorio.AulasRepositorio;

@Controller
@RequestMapping("/aulas")
public class AulaController {

    @Autowired
    private AulasRepositorio aulaRepository;

    @GetMapping
    public String mostrarAulas(Model model) {
        model.addAttribute("aula", new Aulas());
        model.addAttribute("aulas", aulaRepository.findAll());
        return "aulas";
    }

    @PostMapping("/guardarAula")
    public String guardarAula(@ModelAttribute Aulas aula) {
        aulaRepository.save(aula);
        return "redirect:/aulas";
    }

    @GetMapping("/edit/{idAula}")
    public String editarAula(@PathVariable("idAula") int id, Model model) {
        Aulas aula = aulaRepository.findById(id).orElse(null);
        model.addAttribute("aula", aula != null ? aula : new Aulas());
        model.addAttribute("aulas", aulaRepository.findAll());
        return "aulas"; 
    }
    
    @GetMapping("/delete/{idAula}")
    public String eliminarAula(@PathVariable("idAula") int id) {
        aulaRepository.deleteById(id);
        return "redirect:/aulas";
    }
}
