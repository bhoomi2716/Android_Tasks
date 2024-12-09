open class Person(Name :String, Age : Int)
{
    final var name=Name
    final var age=Age
}

class Student(Grade: String, Name: String, Age: Int) : Person(Name, Age)
{
    var sgrade=Grade
    var sname=Name
    var sage=Age

    fun PrintDetails()
    {
        println("Student Name : $sname")
        println("Student Age : $sage")
        println("Student Grade : $sgrade")
        School.addPeoples()
    }
}

class Teacher(Subject : String,Name :String, Age : Int) : Person(Name, Age)
{
    var tsubject=Subject
    var tname=Name
    var tage=Age

    fun PrintDetails()
    {
        println("Teacher Name : $tname")
        println("Teacher Age : $tage")
        println("Teacher Subject : $tsubject")
        School.addPeoples()
    }
}

class School
{
    companion object
    {
        var totalPeople=0
        fun addPeoples()
        {
            totalPeople++
        }
        fun getTotalPeople()
        {
            println("Total Person In School Is : $totalPeople")
        }
    }
}

fun main()
{
    println("Enter Student Name : ")
    var sname= readln().toString()

    println("Enter Student Age : ")
    var sage= readln().toInt()

    println("Enter Student Grade : ")
    var sgrade= readln().toString()

    var stu=Student(Name=sname,Age=sage, Grade = sgrade)
    stu.PrintDetails()
    println("----------------------------------------------------------")

    println("Enter Teacher Name : ")
    var tname= readln().toString()

    println("Enter Teacher Age : ")
    var tage= readln().toInt()

    println("Enter Teacher Subject : ")
    var tsub= readln().toString()

    var tea=Teacher(Name=tname,Age=tage, Subject = tsub)
    tea.PrintDetails()
    println("----------------------------------------------------------")

    School.getTotalPeople()
}