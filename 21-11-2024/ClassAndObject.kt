class student
{
//    var enrollmentNo:
    var Name=""
//    var Age:

    fun displayInfo()
    {
//        println("Your Enrollment Number Is : $enrollmentNo")
        println("Your Name Is : $Name")
//        println("Your Age Is : $Age")
    }
}

fun main()
{
    var Stu1=student()
//    Stu1.enrollmentNo = 101
    Stu1.Name="abc"
//    Stu1.Age= 21

    Stu1.displayInfo()
}
