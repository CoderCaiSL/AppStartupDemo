package com.example.appstartupdemo

import android.content.Context
import androidx.startup.Initializer

/**
 * @author: CaiSongL
 * @date: 2023/3/6 10:53
 */
class NoodleInitializer : Initializer<Noodle> {
    override fun create(context: Context): Noodle {
        return Noodle.getInstance()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}