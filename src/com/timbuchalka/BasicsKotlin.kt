package com.timbuchalka


fun main(args: Array<String>){

    val name: String
    name = "Siddharth"
    val namesecond = "ronn"

    val basicsKotlin = BasicsKotlin("1",1)
    val basicsKotlin2 : BasicsKotlin
    val number = 10
    val number2 = 20
    if( number2<number){
        basicsKotlin2 = BasicsKotlin("1",200)
        print(basicsKotlin2.number)
    }
    else{
        basicsKotlin2 = BasicsKotlin("2",150)
        print(basicsKotlin2.number)
    }

    print("name is "+name)

    val sumCondition = 69>60

   val sum =  if (sumCondition) 50 else 90
   println(sum)

//    showMyInfo(600)

    showMyRangeExistence()
    showSmartCasting()

}

fun showMyInfo(num:Int){
    when(num){
        100->{
            println("Congratulation: $num")
        }
        200->{
            println("Congratulation: $num")
        }
        300->{
            println("Congratulation: $num")
        }
        400->{
            println("Congratulation: $num")
        }
        else-> println("Sorry there is no number for your input ")
    }
}

//check the range

val rangeContained = 400
fun showMyRangeExistence(){
    when(rangeContained){
        rangeContained+90-> println("Your range exists over here")
        in 300..1200-> println("it does exists")
        else-> println("Sorry there is no number for your input ")
    }
}


fun showSmartCasting(){

    val obj: Any = 23
    val obj1 : Any = "23.9"
    val obj3 : Any = 234.90

    if(obj3 is String){
        println("is string")
    }
    else if (obj3 is Int){
        println("It is int")
    }
    else if(obj3 is Double){
        println("It is Double")
    }
}


class BasicsKotlin(val id: String, var number: Int ) {}
