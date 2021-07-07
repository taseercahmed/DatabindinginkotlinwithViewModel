package com.databindinginkotlinviewmodel.utils

object StringUtils {

    @JvmStatic
    fun getrating(totalrating:Int):String{
        return "($totalrating)"
    }
    @JvmStatic
    fun getprice(price:Double):String{
        return "($price)$"
    }

}