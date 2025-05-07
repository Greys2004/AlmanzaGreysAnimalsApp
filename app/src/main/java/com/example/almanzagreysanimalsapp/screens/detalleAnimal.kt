package com.example.almanzagreysanimalsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import com.example.almanzagreysanimalsapp.models.Animal

@Composable
fun detalleAnimal(animal: Animal, innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(animal.name, style = MaterialTheme.typography.headlineLarge, color = Color.White)

        Image(
            painter = rememberAsyncImagePainter(animal.image),
            contentDescription = animal.name,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )

        Text(animal.description, color = Color.White)

        Text(
            "Hechos Interesantes",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Yellow,
            modifier = Modifier.padding(top = 16.dp)
        )

        animal.facts.forEach { fact ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Text("• $fact", color = Color.White)
            }
        }
    }
}