package com.ForoHud.ForoHud.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Repuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer repuestaId;

    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private Boolean solicon;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    // Getters y setters
}