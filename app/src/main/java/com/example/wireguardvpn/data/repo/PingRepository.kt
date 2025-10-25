package com.example.wireguardvpn.data.repo

class PingRepository {
    fun ping(host: String): Long = 42L // TODO real ICMP/UDP ping
}
