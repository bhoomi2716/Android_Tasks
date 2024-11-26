class student
{
    var enrollmentNo : Int ? = 0
    var Name = ""
    var Age : Int? = 0

    fun displayInfo()
    {
        println("Your Enrollment Number Is : $enrollmentNo")
        println("Your Name Is : $Name")
        println("Your Age Is : $Age")
    }
}

fun main()
{
    println("--------------------------------------------")

    var Stu1=student()
    Stu1.enrollmentNo = 101
    Stu1.Name = "abc"
    Stu1.Age = 21
    Stu1.displayInfo()

    println("--------------------------------------------")

    var Stu2=student()
    Stu2.enrollmentNo = 102
    Stu2.Name = "xyz"
    Stu2.Age = 20
    Stu2.displayInfo()

    println("--------------------------------------------")
}
