package com.example.portalberita

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.portalberita.screens.BottomNavigationMainScreenView
import com.example.portalberita.ui.theme.PortalBeritaTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortalBeritaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    BottomNavigationMainScreenView()
                    // HomeScreen(username)
                }
            }
        }
    }
}