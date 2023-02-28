package com.example.portalberita.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portalberita.R
import com.example.portalberita.ui.theme.PortalBeritaTheme

@Composable
fun SignUpForm(
    btnOnClickAction: (String?) -> Unit
) {
    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confirmpasswordInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = firstnameInput,
            onValueChange = { firstnameInput = it },
            label = { Text(text = stringResource(id = R.string.first_name)) },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = lastnameInput,
            onValueChange = { lastnameInput = it },
            label = { Text(text = stringResource(id = R.string.last_name)) },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = usernameInput,
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(id = R.string.label_username)) },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(id = R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = confirmpasswordInput,
            onValueChange = { confirmpasswordInput = it },
            label = { Text(text = stringResource(id = R.string.confirm_password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )
        Button(
            onClick = {
                btnOnClickAction(usernameInput)
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
        ) {
            Text(stringResource(R.string.btn_label_ok))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpFormPreview() {
    PortalBeritaTheme {
        SignUpForm({})
    }
}