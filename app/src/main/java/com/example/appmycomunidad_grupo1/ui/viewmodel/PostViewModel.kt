package com.example.appmycomunidad_grupo1.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appmycomunidad_grupo1.ui.data.model.Post
import com.example.appmycomunidad_grupo1.ui.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
// ViewModel que mantiene el estado de los datos obtenidos
class PostViewModel: ViewModel(){

    private val repository = PostRepository()
    // Flujo mutable que contiene la lista de posts

    private val _postList = MutableStateFlow<List<Post>>(emptyList())
    // Flujo publico de solo Lectura

    val postList: StateFlow<List<Post>> = _postList
    // se llaman automaticamente al iniciar
    init {
        fetchPosts()
    }
    // Funcion que obtiene los datos en segundo plano

    private fun fetchPosts() {
        viewModelScope.launch {
            try {
                _postList.value = repository.getPosts()
            } catch (e: Exception) {
                println("Error al obtener datos: ${e.localizedMessage}")
            }
        }
    }


}