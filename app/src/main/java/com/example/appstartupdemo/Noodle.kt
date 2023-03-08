package com.example.appstartupdemo

/**
 * @author: CaiSongL
 * @date: 2023/3/6 10:41
 */
class Noodle {

    val name = "面条"
    companion object{
        private var instance : Noodle ? = null
        fun getInstance() : Noodle{
            if (instance == null){
                instance = Noodle()
            }
            return instance!!
        }
    }

}