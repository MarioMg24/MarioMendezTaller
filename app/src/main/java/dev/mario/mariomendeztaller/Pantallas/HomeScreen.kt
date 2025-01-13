package dev.mario.mariomendeztaller.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Black,
                onClick = { navController.navigate("add") }
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
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
                title = { Text("Top Cantantes", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Go back",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            Column {
                ItemContact("Luis Miguel= El 'Sol de México', reconocido por su potente voz.")
                ItemContact("Cristian Castro= Cantante icónico conocido 'Por amarte así'." )
                ItemContact("Luis Fonsi= Famoso por el éxito global 'Despacito'." )
                ItemContact("David Bisbal= Artista español con una energía única." )
                ItemContact("Alejandro Fernandez= El 'Potrillo'." )
                ItemContact("Jose Jose= Conocido como 'El Príncipe de la Canción'." )
                ItemContact("Juan Gabriel= Cantautor icónico." )
                ItemContact("Vicente Fernandez= Icono de la música ranchera mexicana." )
                ItemContact("Carlos Rivera= Talentoso cantante mexicano ." )
                ItemContact("Mario Mendez= Nueva promesa de la música." )
            }
        }
    }
}


