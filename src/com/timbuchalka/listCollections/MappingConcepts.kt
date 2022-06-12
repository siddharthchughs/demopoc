package com.timbuchalka.listCollections

fun main(args: Array<String>) {

    val mappingData = mapOf<Int,Student>(
        1 to Student(grade = "2", firstName = "Siddharth", lastName = "Chugh", yearOfJoin = 2010),
        2 to Student(grade = "6", firstName = "Jessica", lastName = "White", yearOfJoin = 2009),
        3 to Student(grade = "4", firstName = "Johanas", lastName = "Brown", yearOfJoin = 2009),
        4 to Student(grade = "4", firstName = "Tom", lastName = "Cruise", yearOfJoin = 2008),
        5 to Student(grade = "9", firstName = "Tom", lastName = "Hanks", yearOfJoin = 2010),
        6 to Student(grade = "10", firstName = "Will", lastName = "Smith", yearOfJoin = 2009),
        7 to Student(grade = "10", firstName = "", lastName = "", yearOfJoin = 0)
    )

    val mappingStudent = listOf(
        Student(grade = "2", firstName = "Siddharth", lastName = "Chugh", yearOfJoin = 2010),
        Student(grade = "6", firstName = "Jessica", lastName = "White", yearOfJoin = 2009),
        Student(grade = "4", firstName = "Johanas", lastName = "Brown", yearOfJoin = 2009),
        Student(grade = "4", firstName = "Tom", lastName = "Cruise", yearOfJoin = 2008),
        Student(grade = "9", firstName = "Tom", lastName = "Hanks", yearOfJoin = 2010),
        Student(grade = "10", firstName = "Will", lastName = "Smith", yearOfJoin = 2009),
        Student(grade = "10", firstName = "", lastName = "", yearOfJoin = 0)
    )


    val resultMapping = mappingData.filter { it->

       it.value.grade< 4.toString() || it.value.grade<6.toString()
    }

   showStudentName(mappingStudent, "Hanks")



    //first filter
    val resultyr = (mappingData.filter { it.value.yearOfJoin.toInt()==2009  })

    resultyr.forEach{
        println("${it.value.firstName}")

    }
    // Second Filter

    val resultMap= mappingData.filter {
        it-> it.value.firstName.contains("o", false) || it.value.lastName.contains("s", false)
    }



    resultMapping.forEach{
        println("${it.value.firstName} ${it.value.lastName} : ${it.value.yearOfJoin}")
    }

    class Student(val firstName: String, val lastName: String, val grade: String, val yearOfJoin: Int) {}

}
fun showStudentName(student: List<Student>, name:String){

    for (studentElements in student){
        if(studentElements.firstName == name){
            println("the names as as followd: ${studentElements.firstName}")
            return
        }
    }


}


