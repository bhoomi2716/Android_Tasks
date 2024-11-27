class stud
{
    fun display(eno:Int, nm:String)
    {
        println("Your Enrollment ID Is : $eno")
        println("Your Name Is : $nm")
    }

    fun display(eno: Int,nm: String,mob: Int)
    {
        println("Your Enrollment ID Is : $eno")
        println("Your Name Is : $nm")
        println("Your Mobile Number Is : $mob")
    }
}


fun main()
{
    var stu=stud()
    stu.display(101,"abc")

    println("===============================================")

    stu.display(102,"xyz",98989898)
}