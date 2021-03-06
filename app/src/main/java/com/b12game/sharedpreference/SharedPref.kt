package com.b12game.sharedpreference

import android.content.Context
import androidx.core.content.edit

class SharedPref(context: Context) {
    private val number = 7
    private val pref = context.getSharedPreferences("nimadir",Context.MODE_PRIVATE)

    var isSaved: Boolean
    get() = pref.getBoolean("isSaved",false)
    set(value) = pref.edit { this.putBoolean("isSaved",value) }



//    fun isSaved(isSaved: Boolean){
//        val editor = pref.edit()
//        editor.putBoolean("isSaved",isSaved)
//        editor.apply()
//    }
//
//    fun getSaved():Boolean{
//        return pref.getBoolean("isSaved",false)
//    }

}