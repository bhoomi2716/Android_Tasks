class stu(name:String, eno:Int)
{
    var Name=name
    var Eno=eno

    companion object
    {
        var collage="ABC"
        fun displayCollage()
        {
            println("Your Collage Name Is : $collage")
        }
    }

    fun diplay()
    {
        println("Your Name Is : $Name")
        println("Your Enrollment Number Is : $Eno")
    }
}

fun main()
{
    println("Enter Your Name : ")
    var name= readln().toString()

    println("Enter Your Enrollment Number ")
    var eno= readln().toInt()

    var STU=stu(name,eno)
    STU.diplay()
    stu.displayCollage()

    println("---------------------------------------")

    var stu2=stu("xyz",102)
    stu2.diplay()
    stu.displayCollage()



}