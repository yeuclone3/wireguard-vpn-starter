package com.example.wireguardvpn.data.model

data class Server(
    val name: String,
    val host: String,
    val publicKey: String,
    val endpoint: String
)
