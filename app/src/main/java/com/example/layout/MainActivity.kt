package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            ActividadConstraintLayout()
        }
    }
}

@Composable
fun ActividadConstraintLayout() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        // Creamos las referencias de los tres botones
        val (view1, view2, view3) = createRefs()

        // Primer botón
        Button(
            onClick = { },
            modifier = Modifier.constrainAs(view1) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("VIEW 1")
        }

        // Segundo botón
        Button(
            onClick = { },
            modifier = Modifier.constrainAs(view2) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("VIEW 2")
        }

        // Tercer botón
        Button(
            onClick = { },
            modifier = Modifier.constrainAs(view3) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("VIEW 3")
        }

        // Cadena vertical de los tres botones
        createVerticalChain(
            view1,
            view2,
            view3,
            chainStyle = ChainStyle.Packed
        )
    }
}