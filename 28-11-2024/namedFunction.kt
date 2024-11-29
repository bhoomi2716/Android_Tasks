class emp
{
    fun display(name : String, empno : Int, phno : Int)
    {
        println("Name : $name")
        println("Employee Number : $empno")
        println("Mobile Number : $phno")
    }
}

fun main()
{
    var e=emp()

    e.display(name="abc", phno = 78451298, empno = 11)
}