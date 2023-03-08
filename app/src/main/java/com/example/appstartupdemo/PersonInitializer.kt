package com.example.appstartupdemo

import android.content.Context
import androidx.startup.Initializer

/**
 * @author: CaiSongL
 * @date: 2023/3/6 10:50
 */
class PersonInitializer : Initializer<Person> {
    override fun create(context: Context): Person {
        return Person.getInstance("小菜").apply {
            addNoodle(Noodle.getInstance())
        }
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(NoodleInitializer::class.java)
    }
}