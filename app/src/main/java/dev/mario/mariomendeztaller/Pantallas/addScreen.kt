package dev.mario.mariomendeztaller.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun addScreen(navController: NavHostController) {
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Black,
                onClick = { navController.navigate("index") }
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Go to add Screen",
                    tint = Color.White
                )
            }
        },
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black
                ),
                title = { Text("Top Bandas", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go back",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ){ paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            Column {
                ItemContact("Sin Bandera= Dúo mexicano-argentino" )
                ItemContact("Camila= Banda mexicana de pop/rock " )
                ItemContact("Reik= Grupo mexicano pop/baladas románticas" )
                ItemContact("Elefante= Banda mexicana de rock/pop" )
                ItemContact("Mana= Banda de rock latino originaria de México" )
                ItemContact("Soda Stereo= Legendaria banda argentina de rock alternativo" )
                ItemContact("Enanitos Verdes= Banda de rock en español de Argentina" )
                ItemContact("Tranzas= Grupo ecuatoriano de pop/rock" )
                ItemContact("Hombres G= Banda española de pop/rock " )
                ItemContact("Zoe= Banda mexicana de rock alternativo" )
            }
        }
    }
}

