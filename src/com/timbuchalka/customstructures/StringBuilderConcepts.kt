package com.timbuchalka.customstructures

fun main(args:Array<String>) {

    val name = "Siddharth"
    val stringBuilder = StringBuilder()

    for (i in 0..name.length - 1) {
        println("${i} :: ${name[i]}")
    }
    println("d" in name)

    // each character is at which position in the String :: Siddharth
    for (i in name.indices) {
        if (name[i] == name.get(i)) {
            println("$i :: ${name[i]}")
        }
    }
    // find the d element in the given string :: Siddharth
    var count = 0
    println("""::::""")
    for (i in 0..name.length - 1) {
        if (name[i] == 'd') {
            count++
            println("$i :: ${name[i]}: ${count}")
        }
    }


//    println(":: No of occurrence of ${name.length-i}")

}