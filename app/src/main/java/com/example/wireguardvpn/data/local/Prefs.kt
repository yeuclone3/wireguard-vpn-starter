package com.example.wireguardvpn.data.local

import android.content.Context
import android.content.SharedPreferences

class Prefs(ctx: Context) {
    private val sp: SharedPreferences = ctx.getSharedPreferences("wg", Context.MODE_PRIVATE)
    fun getString(key: String, def: String? = null) = sp.getString(key, def)
    fun putString(key: String, v: String?) = sp.edit().putString(key, v).apply()
}
