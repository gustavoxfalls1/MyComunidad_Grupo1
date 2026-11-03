package com.example.appmycomunidad_grupo1.ui.data.remote

import com.example.appmycomunidad_grupo1.ui.data.model.Post
import retrofit2.http.GET

// Esta interfaz define los endpoints HTTP
interface ApiService {

    // Define una solicitud GET al endpoint /posts
    @GET( value = "/posts")
    suspend fun getPosts(): List<Post>
}