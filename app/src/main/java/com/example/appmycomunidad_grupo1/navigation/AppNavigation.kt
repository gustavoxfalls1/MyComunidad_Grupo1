package com.example.appmycomunidad_grupo1.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appmycomunidad_grupo1.ui.screens.RegistroScreen
import com.example.appmycomunidad_grupo1.ui.screens.ResumenScreen
import com.example.appmycomunidad_grupo1.viewmodel.UsuarioViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    //  Aquí creamos el ViewModel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "registro"
    ) {
        composable("registro") {
            RegistroScreen(navController, usuarioViewModel)
        }

        composable("resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}