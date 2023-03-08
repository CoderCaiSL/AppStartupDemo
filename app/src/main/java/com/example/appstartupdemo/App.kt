package com.example.appstartupdemo

import android.app.Application
import androidx.startup.AppInitializer

/**
 * @author: CaiSongL
 * @date: 2023/3/6 10:55
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppInitializer.getInstance(this)
            .initializeComponent(PersonInitializer::class.java)
    }
}