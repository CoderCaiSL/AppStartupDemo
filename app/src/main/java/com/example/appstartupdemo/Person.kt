package com.example.appstartupdemo

import android.util.Log

/**
 * @author: CaiSongL
 * @date: 2023/3/6 10:41
 */
class Person(val name:String) {

    val TAG = this.javaClass.name

    private var noodle : Noodle ?= null

    companion object{
        private var instance:Person ?= null
        fun getInstance(name: String) : Person{
            if (instance == null){
                instance = Person(name)
            }
            return instance!!
        }
    }

    fun addNoodle(paramsNoodle:Noodle){
        noodle = paramsNoodle
    }

    fun eat(){
        Log.e(TAG,"${name} 吃 ${noodle?.name}")
    }

}