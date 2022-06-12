package com.timbuchalka

fun main(args: Array<String>) {

    val name= "siddharth chugh"

    val result = UtilityHelper().convertStringToUppercase(name)


    /* name is the parameter that is being send to the Extension function */
    val resultOne =   name.convertStringToUppercase()

//    println(result)
//    println(resultOne)
//    println(SomewayClass.accessprivateVar())

    val subString = SomewayClass("Siddharth")
    val subStringAppearence = SomewayClass("Siddharth",true)
        //.assignStringWithLowercase("siddharth",true)
    println(subStringAppearence.someStrings)
//    println(subStringAppearence.st)

}

/*
* String. is the object of the receiver type
* */
fun String.convertStringToUppercase():String{
    val upString = substring(0,1).toUpperCase()+ substring(1)
    return upString.substring(0,upString.length-1) +
            upString.substring(upString.length-1,upString.length).toUpperCase()
}

class SomewayClass{

    // this class doesn't have the primary constructor, which will have the parantheseis with
    //the class/.
    val someStrings :String

    //First Secondary constructors
    constructor(str:String){
        someStrings = str
    }
    // Second Secondary constructors
    constructor(str:String,lowerCase:Boolean){
        if(lowerCase){
           someStrings = str.toUpperCase()
        }
        else{
            someStrings = str.toLowerCase()
        }
    }

    companion object{

        private var privateVarchar = 87

        fun accessprivateVar()=println("I am trying to access the private var: $privateVarchar")

//        fun justAssignString(str:String)= SomewayClass(str)
//        fun assignStringWithLowercase(str:String,lowercase:Boolean):SomewayClass{
//            if(lowercase){
//                return SomewayClass(str.toUpperCase())
//            }
//            else
//            {
//                return SomewayClass(str.toLowerCase())
//            }
//        }



    }

}