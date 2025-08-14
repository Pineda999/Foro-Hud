package com.ForoHud.ForoHud.model

import jakarta.persistence.*

@Entity
class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val autorId: Int? = null

    private val nombre: String? = null
    private val correoElectronico: String? = null
    private val contrasena: String? = null

    @OneToMany(mappedBy = "autor", cascade = [CascadeType.ALL])
    private val topicos: List<Topico>? = null // Getters y setters
}