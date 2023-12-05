package com.example.infoapp.components

import android.telecom.Call
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composecamp.Navigation.Screen
import com.example.composecamp.R
//import  com.example.composecamp.Navigation.Screen
//import com.example.infoapp.R


// 1 -> First make HomePage Composable function and then create a Box
// 2 -> Then make first functions (Lets name it NameCard)
// 3 -> Make first Row and then in the first part make a column
// 4 -> Style it accordingly
// 5 -> Then make next function BranchDetails


@Composable
fun HomePage(
    navController: NavController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column {
            NameCard()
            Lang(
                navController
            )
            BranchDetails()
            DetailedInfo()
            ContactBox()



        }
    }
}

@Composable
fun NameCard(
    name: String = "Yogeshgouda Patil"
){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(26.dp)

    ){
        //    Component One in row

        Column (
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "$name",
                color = Color.Black,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(text = "IIIT Dharwad",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        //Spacer

        Spacer(modifier = Modifier.width(20.dp))

        //    Component Two in row

        Image(painter = painterResource(id = R.drawable.qwerty), contentDescription = "Profile Image",
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }

}

@Composable
fun DetailedInfo(){
    Column {


        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, top = 15.dp)
//                .padding(start = 18.dp, top = 15.dp, bottom = 15.dp)
        ) {
            item {
//                This is the first Blue Box containing the Student details
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Blue)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column ()
                    {
                        Text(
                            text = "Course: B Tech",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Dob: 18/10/2005",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Contact No: 8431909896",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Valid upto: Jul 27",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )

                    }

                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Blue)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.qwerty), contentDescription = "Qr Code",
                        modifier = Modifier.width(100.dp))
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }



            item {
                Spacer(modifier = Modifier.width(20.dp))
            }




        }
    }

}
@Composable
fun ContactBox(){
    Row(

        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Green.copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)

        )
        {
            Icon(
                Icons.Default.Call, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.Email, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.LocationOn, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.Share, contentDescription = "Call",
                tint = Color.White
            )
        }

    }
}

@Composable
fun BranchDetails()
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF0000FF).copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "CSE 1st Year",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
            Text(
                text = "23BCS138",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                modifier = Modifier.padding(start = 3.dp)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Cyan)
//                .padding(2.dp)
        ) {
            Icon(
                Icons.Default.Info,
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Composable
fun Lang(
    navController: NavController
) {
    Spacer(modifier = Modifier.height(2.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 5.dp, top = 10.dp, bottom = 0.dp)
    ) {
        Text(text = "Language: ", color = Color.Blue, modifier = Modifier.padding(start = 20.dp))

        LazyRow {
            val programmingLanguages =
                listOf("C and C++", "Python ", "Java ", "Kotlin ", "Flutter ")

            for (language in programmingLanguages) {
                item {
                    Button(
                        onClick = {
                            navController.navigate(Screen.LangPage.withArgs(language))
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF0000FF).copy(
                                0.8f
                            )
                        ),
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .padding(15.dp)
                    ) {
                        Text(text = language, color = Color.White)
                    }
                }
            }
        }
    }
}




