
package com.example.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ActividadImparesPares() {

    var contador1 by rememberSaveable {
        mutableIntStateOf(0)
    }

    var contador2 by rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                contador1 = if (contador1 == 0) 1 else contador1 + 2
            }
        ) {
            Text("Pulsar1")
        }

        Text("He sido pulsado $contador1 veces")

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                contador2 = if (contador2 == 0) 2 else contador2 + 2
            }
        ) {
            Text("Pulsar2")
        }

        Text("He sido pulsado $contador2 veces")
    }
}
