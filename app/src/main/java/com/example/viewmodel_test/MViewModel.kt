package com.example.viewmodel_test

import androidx.lifecycle.ViewModel

class MViewModel : ViewModel(){

    var result : Int = 0

    fun plus() : Int {

        result += 1

        return result
    }

    fun minus() : Int {

        result -= 1

        return result
    }

}