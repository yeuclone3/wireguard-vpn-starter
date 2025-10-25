package com.example.wireguardvpn.data.repo

import android.content.Context
import com.example.wireguardvpn.data.model.Server
import org.json.JSONArray

class ServerRepository(private val ctx: Context) {
    fun list(): List<Server> {
        val json = ctx.assets.open("servers.sample.json").reader().readText()
        val arr = JSONArray(json)
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            Server(
                name = o.getString("name"),
                host = o.getString("host"),
                publicKey = o.getString("publicKey"),
                endpoint = o.getString("endpoint")
            )
        }
    }
}
