package com.ForoHud.ForoHud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.ForoHud.ForoHud.model.Topico;
import com.ForoHud.ForoHud.repository.TopicoRepository;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository; // instancia, no clase

    // Crear un tópico
    @PreAuthorize("hasRole('USER')")
    @PostMapping
    public Topico crearTopico(@RequestBody Topico topico){
        return topicoRepository.save(topico);
    }

    // Obtener todos los tópicos
    @PreAuthorize("hasRole('USER')")
    @GetMapping
    public List<Topico> obtenerTodos(){
        return topicoRepository.findAll();
    }

    // Obtener un tópico por ID
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/{id}")
    public Topico obtenerPorId(@PathVariable Integer id){
        return topicoRepository.findById(id).orElse(null);
    }

    // Actualizar un tópico
    @PreAuthorize("hasRole('USER')")
    @PutMapping("/{id}")
    public Topico actualizarTopico(@PathVariable Integer id, @RequestBody Topico topicoDetalles){
        return topicoRepository.findById(id).map(topico -> {
            topico.setTitulo(topicoDetalles.getTitulo());
            topico.setMensaje(topicoDetalles.getMensaje());
            topico.setEstatus(topicoDetalles.getEstatus());
            return topicoRepository.save(topico);
        }).orElse(null);
    }

    // Eliminar un tópico
    @PreAuthorize("hasRole('USER')")
    @DeleteMapping("/{id}")
    public void eliminarTopico(@PathVariable Integer id){
        topicoRepository.deleteById(id);
    }
}