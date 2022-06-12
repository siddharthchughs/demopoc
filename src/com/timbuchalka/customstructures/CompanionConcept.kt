package com.timbuchalka.customstructures

import com.timbuchalka.SomewayClass


fun main(arg: Array<String>){
    val sC  = SomeClass.convertLowerCase("siddh",false)
    println(sC.msg)
    println(MySingelton.mydata())
    WantSomethingFrmInterface(object : SomeInfo{
        override fun showData(data: Int): String = "Must implement"+data*1000
    })


}

 class SomeClass private constructor(val msg:String) {

     companion object {
         fun convertLowerCase(msg: String, formatMesg: Boolean): SomeClass {
             if (formatMesg) {
                 return SomeClass(msg.toUpperCase())
             } else {
                 return SomeClass(msg.toLowerCase())
             }
         }
     }

 }
     interface SomeInfo{
         fun showData(data:Int):String
     }

     fun WantSomethingFrmInterface(someInfo: SomeInfo){
         println("Hey there this me your custom created interface ${someInfo.showData(23)}")
     }


object MySingelton{

    fun mydata() = "Hey their I am being called from the singleton"

}

