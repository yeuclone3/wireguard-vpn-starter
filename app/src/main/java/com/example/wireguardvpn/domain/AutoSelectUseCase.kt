package com.example.wireguardvpn.domain

import com.example.wireguardvpn.data.repo.PingRepository
import com.example.wireguardvpn.data.repo.ServerRepository

class AutoSelectUseCase(
    private val servers: ServerRepository,
    private val ping: PingRepository
) {
    fun best(): String {
        // TODO: pick the lowest ping server
        return "US-East"
    }
}
