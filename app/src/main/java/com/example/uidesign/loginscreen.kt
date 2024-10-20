package com.example.uidesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.awt.font.TextAttribute
import java.util.jar.Attributes.Name

@Composable
fun MarginAndPadding(){




}

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ){

        Spacer(modifier = Modifier.height(50.dp))
        Image(painter = painterResource(id = R.drawable.a), contentDescription ="LoginImage" ,
        modifier = Modifier.size(70.dp).padding(start = 25.dp))


        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Sign Up",Modifier.padding(start = 25.dp), fontSize =20.sp , fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(value = "", onValueChange = {},Modifier.padding(start = 25.dp), label = {
            Text(text = "Name")})

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(value = "", onValueChange = {},Modifier.padding(start = 25.dp), label = {
            Text(text = "Email")})

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(value = "", onValueChange = {},Modifier.padding(start = 25.dp), label = {
            Text(text = "Create Password")})

        Spacer(modifier = Modifier.height(25.dp))
        Button(onClick = { }, modifier = Modifier.padding(start = 125.dp)) {
            Text(text = "Sign Up", modifier = Modifier.clickable {
            })}

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "By Signing Up,You agree to our Terms & Policy",Modifier.padding(start = 40.dp), fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Or",Modifier.padding(start = 170.dp))

    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 580.dp, start = 92.dp),
        horizontalArrangement = Arrangement.spacedBy(18.dp)

    ){
        Image(painter = painterResource(id =R.drawable.f ),
            contentDescription = "Facebook",
            modifier = Modifier
                .size(50.dp)
                .clickable {
                    //        facebook clickable)
                })

        Image(painter = painterResource(id =R.drawable.g ),
            contentDescription = "Google",
            modifier = Modifier
                .size(50.dp)
                .clickable {
                    //        Google clickable)
                })

        Image(painter = painterResource(id =R.drawable.tw ),
            contentDescription = "twitter",
            modifier = Modifier
                .size(50.dp)
                .clickable {
                    //        twitter clickable)
                })

    }
    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Text(text = "Already have an account?", modifier = Modifier.padding(top = 700.dp, start = 100.dp), fontSize = 16.sp)
        Text(text ="Login" ,modifier = Modifier.clickable {  }.padding(top = 700.dp), fontSize = 16.sp,fontWeight = FontWeight.Bold)

    }
    }



//{
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 580.dp)
//    )
//    Spacer(modifier = Modifier.height(20.dp))
//    Text(text = "Already have an account?")
//    Text(text ="Login" ,modifier = Modifier.clickable {  })
//}


