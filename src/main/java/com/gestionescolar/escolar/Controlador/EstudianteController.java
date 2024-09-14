package com.gestionescolar.escolar.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionescolar.escolar.modelo.Estudiante;
import com.gestionescolar.escolar.repositorio.EstudianteRepositorio;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepositorio estudianteRepository;

    @GetMapping
    public String mostrarEstudiantes(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "estudiantes";
    }

    @PostMapping("/guardarEstudiante")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/edit/{idEstudiante}")
    public String editarEstudiante(@PathVariable("idEstudiante") int id, Model model) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
        }
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "estudiantes";
    }

    @GetMapping("/delete/{idEstudiante}")
    public String eliminarEstudiante(@PathVariable("idEstudiante") int id) {
        estudianteRepository.deleteById(id);
        return "redirect:/estudiantes";
    }
}
