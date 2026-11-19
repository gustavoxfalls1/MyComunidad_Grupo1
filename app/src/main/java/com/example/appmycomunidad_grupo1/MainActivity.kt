package com.example.appmycomunidad_grupo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat //Necesario para edge-to-edge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appmycomunidad_grupo1.ui.screens.PostScreen
import com.example.appmycomunidad_grupo1.ui.theme.AppMyComunidad_Grupo1Theme
import com.example.appmycomunidad_grupo1.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppMyComunidad_Grupo1Theme {
                AppNavigation()
            }
        }
    }
}
