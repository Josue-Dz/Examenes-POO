package hn.unah.examenii.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examenii.dtos.DueniosDTO;
import hn.unah.examenii.servicios.DueniosServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/duenios")
public class DuenioController {

    @Autowired
    private DueniosServicio dueniosServicio;

    @PostMapping("/crear")
    public String insertar(@RequestBody DueniosDTO dueniosDTO) {
        return dueniosServicio;
    }

    @GetMapping("/buscar/{dni}")
    public String buscarPorId(@PathVariable(name = "dni") String dni) {
        return new String();
    }

    @GetMapping("/obtener/todos")
    public List<DueniosDTO> obtenerTodos() {
        return;
    }

}
