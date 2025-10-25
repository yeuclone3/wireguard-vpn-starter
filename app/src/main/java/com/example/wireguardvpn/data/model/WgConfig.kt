package com.example.wireguardvpn.data.model

data class WgConfig(
    val privateKey: String,
    val address: String,
    val dns: String,
    val peerPublicKey: String,
    val endpoint: String
)
