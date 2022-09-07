package com.example.bikeanimation.view

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.bikeanimation.R


enum class BikePosition{
    Start,Finish
}

@Preview
@Composable
fun BikeScreen(){

    var bikeState by remember { mutableStateOf(BikePosition.Start) }

    // animateDpAsState
    val offsetAnimation :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp
    )
    // StiffnessLow
    val offsetAnimation1 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(stiffness = Spring.StiffnessLow)
    )
    // StiffnessMedium
    val offsetAnimation2 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(stiffness = Spring.StiffnessMedium)
    )
    // StiffnessMedium
    val offsetAnimation3 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(stiffness = Spring.StiffnessHigh)
    )
    // DampingRatioLowBouncy
    val offsetAnimation4 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(dampingRatio = Spring.DampingRatioLowBouncy)
    )
    // DampingRatioLowBouncy
    val offsetAnimation5 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )
    // DampingRatioLowBouncy
    val offsetAnimation6 :Dp by animateDpAsState(
        if (bikeState == BikePosition.Start) 5.dp else 300.dp,
        spring(dampingRatio = Spring.DampingRatioHighBouncy)
    )

    Box(modifier = Modifier.fillMaxSize()
    ) {
        Column(Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(120.dp))
            Image(painter = painterResource(id = R.drawable.cycler),
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .absoluteOffset(x = offsetAnimation1)
            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation1)
//            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation2)
//            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation3)
//            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation4)
//            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation5)
//            )
//            Image(painter = painterResource(id = R.drawable.cycler),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(90.dp)
//                    .absoluteOffset(x = offsetAnimation6)
//            )

        }
        Button(onClick = {
         bikeState = when(bikeState){
             BikePosition.Start -> BikePosition.Finish
             BikePosition.Finish-> BikePosition.Start
         }
        },
            modifier = Modifier.fillMaxSize()
                .wrapContentSize(align = Alignment.Center)
        ) {
            Text(text = "Ride")
        }
        /*ok run it*/

    }


}