package com.example.appmycomunidad_grupo1.ui.repository

import com.example.appmycomunidad_grupo1.ui.data.model.Post
import com.example.appmycomunidad_grupo1.ui.data.remote.RetrofitInstance

// Este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {

   // Función que obtiene los posts desde la API
   suspend fun getPosts(): List<Post> {
       return RetrofitInstance.api.getPosts()
   }
}
