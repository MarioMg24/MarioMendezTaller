package dev.mario.mariomendeztaller.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun Index(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1E1E1E) // Fondo oscuro para el AppBar
                ),
                title = {
                    Text("Home", color = Color.White)
                }, navigationIcon = { // Ícono de casa a la izquierda
                    IconButton(onClick = {
                        // Acción al presionar el ícono (puedes dejarlo vacío si no necesitas acción)
                    }) {
                        Icon(
                            imageVector = Icons.Default.Home, // Ícono de casa
                            contentDescription = "Home Icon",
                            tint = Color.White
                    )
                }}
            )
        },
        containerColor = Color(0xFF121212) // Fondo oscuro para toda la pantalla
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = { navController.navigate("home") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6200EA), // Púrpura oscuro
                        contentColor = Color.White // Color del texto e ícono
                    ),
                    shape = RoundedCornerShape(16.dp), // Bordes redondeados
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Top Cantantes")
                }
                Button(
                    onClick = { navController.navigate("add") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF03DAC6), // Verde agua
                        contentColor = Color.Black // Color del texto e ícono
                    ),
                    shape = RoundedCornerShape(16.dp), // Bordes redondeados
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Top Bandas")
                }
            }
        }
    }
}
