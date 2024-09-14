package com.gestionescolar.escolar.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionescolar.escolar.modelo.Curso;
import com.gestionescolar.escolar.repositorio.CursoRepositorio;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepositorio cursoRepository;

    @GetMapping
    public String mostrarCursos(Model model) {
        model.addAttribute("curso", new Curso());
        model.addAttribute("cursos", cursoRepository.findAll());
        return "cursos";
    }

    @PostMapping("/guardarCurso")
    public String guardarCurso(@ModelAttribute Curso curso) {
        cursoRepository.save(curso);
        return "redirect:/cursos";
    }

    @GetMapping("/edit/{idCurso}")
    public String editarCurso(@PathVariable("idCurso") int id, Model model) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        model.addAttribute("curso", curso != null ? curso : new Curso());
        model.addAttribute("cursos", cursoRepository.findAll());
        return "cursos"; // Mantén la misma vista 'cursos.html'
    }

    @GetMapping("/delete/{idCurso}")
    public String eliminarCurso(@PathVariable("idCurso") int id) {
        cursoRepository.deleteById(id);
        return "redirect:/cursos";
    }
}
