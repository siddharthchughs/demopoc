package com.timbuchalka.Helper

class Utility {

    fun showFirstUpperCase(str:String):String{
        val uppserString = str.substring(0,3).toUpperCase() + str.substring(1)
        return uppserString.substring(0,uppserString.length-1) +
                uppserString.substring(uppserString.length -1,uppserString.length).toUpperCase()
    }


}