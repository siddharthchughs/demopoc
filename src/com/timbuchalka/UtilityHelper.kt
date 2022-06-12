package com.timbuchalka

class UtilityHelper {

    /*substring 0 means starts the letter from the beginning and ends till the end.
    * substring 0,1 means starts with the first index of element and ends with the last element of string
    *
    * */
//0123456789
//Siddhartth

    fun convertStringToUppercase(subString:String):String{
        val upString = subString.substring(0,1).toUpperCase()+ subString.substring(1)
        return upString.substring(0,upString.length-1) +
                upString.substring(upString.length-1,upString.length).toUpperCase()
    }

}