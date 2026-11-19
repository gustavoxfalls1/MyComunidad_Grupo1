package com.example.appmycomunidad_grupo1.data

data class UsuarioUiState(
    val nombre: String = "",              // Nombre del usuario
    val correo: String = "",              // Correo electrónico
    val clave: String = "",               // Contraseña
    val direccion: String = "",           // Dirección del usuario
    val edad: Int =0,
    val aceptaTerminos: Boolean = false,  // Confirmación de términos
    val errores: UsuarioErrores = UsuarioErrores() // Objeto que contiene los errores por campo
)