package com.example.wireguardvpn.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GlowCard(text: String) {
    Card { Text(text, Modifier.padding(16.dp)) }
}
