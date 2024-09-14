package com.gestionescolar.escolar.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionescolar.escolar.modelo.Profesor;
import com.gestionescolar.escolar.repositorio.ProfesorRepositorio;

@Controller
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorRepositorio profesorRepository;

    @GetMapping
    public String mostrarProfesores(Model model) {
        model.addAttribute("profesor", new Profesor());
        model.addAttribute("profesores", profesorRepository.findAll());
        return "profesores";
    }

    @PostMapping("/guardarProfesor")
    public String guardarProfesor(@ModelAttribute Profesor profesor) {
        profesorRepository.save(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/edit/{idProfesor}")
    public String editarProfesor(@PathVariable("idProfesor") int id, Model model) {
        Profesor profesor = profesorRepository.findById(id).orElse(null);
        if (profesor != null) {
            model.addAttribute("profesor", profesor);
        }
        model.addAttribute("profesores", profesorRepository.findAll());
        return "profesores";
    }

    @GetMapping("/delete/{idProfesor}")
    public String eliminarProfesor(@PathVariable("idProfesor") int id) {
        profesorRepository.deleteById(id);
        return "redirect:/profesores";
    }
}
