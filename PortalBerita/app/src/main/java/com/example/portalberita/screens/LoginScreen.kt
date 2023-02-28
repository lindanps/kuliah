package com.example.portalberita.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.portalberita.HomeActivity
import com.example.portalberita.R
import com.example.portalberita.contracts.SignUpContract

internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = usernameInput,
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(R.string.label_username)) },
            modifier = Modifier.fillMaxWidth()

        )
        TextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = {
                    val isAuthenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthenticated) {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", usernameInput)
                                }
                        )
                    }
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = stringResource(R.string.btn_title_login))
            }
            Button(
                onClick = {
                    getUsernameFromSignedUpForm.launch("")
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = stringResource(R.string.btn_title_signup))
            }
        }
    }
}