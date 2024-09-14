package com.gestionescolar.escolar.Controlador;

import com.gestionescolar.escolar.modelo.Matriculas;
import com.gestionescolar.escolar.servicio1.ServicioMatriculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private ServicioMatriculas servicioMatriculas;

    // Listar todas las matrículas
    @GetMapping
    public String listarMatriculas(Model model) {
        List<Matriculas> matriculas = servicioMatriculas.listarMatriculas();
        model.addAttribute("matriculas", matriculas);
        model.addAttribute("nuevaMatricula", new Matriculas());
        return "matriculas";
    }

    // Editar matrícula por ID
    @GetMapping("/editar/{id}")
    public String editarMatricula(@PathVariable("id") int id, Model model) {
        Matriculas matricula = servicioMatriculas.obtenerMatriculasPorId(id);
        model.addAttribute("matricula", matricula);
        return "editar-matricula";
    }

    // Guardar nueva matrícula o cambios en una existente
    @PostMapping("/guardar")
    public String guardarMatricula(@ModelAttribute Matriculas matricula) {
        servicioMatriculas.guardarMatriculas(matricula);
        return "redirect:/matriculas";
    }

    // Eliminar matrícula por ID
    @GetMapping("/eliminar/{id}")
    public String eliminarMatricula(@PathVariable("id") int id) {
        servicioMatriculas.eliminarMatriculas(id);
        return "redirect:/matriculas";
    }
}
