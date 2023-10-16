package com.cicerodev.todoappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cicerodev.todoappcompose.components.ProfileHeaderComponent
import com.cicerodev.todoappcompose.components.WelcomeMessageComponent
import com.cicerodev.todoappcompose.ui.theme.TODOAPPCOMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TODOAPPCOMPOSETheme {
                // A surface container using the 'background' color from the theme
                LazyColumn(
                    contentPadding = PaddingValues(
                        start = 16.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
                ) {
                    item {
                        ProfileHeaderComponent()

                    }
                    item {
                        Spacer(modifier = Modifier.height(30.dp))

                        WelcomeMessageComponent()

                        Spacer(modifier = Modifier.height(30.dp))
                    }
                }
            }
        }
    }
}