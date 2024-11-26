interface AA
{
    fun a()
    {
        println("Calling A.....")
    }
}

interface BB
{
    fun b()
    {
        println("Calling B.....")
    }
}

class C : AA,BB
{
    fun c()
    {
        println("Calling C.....")
    }
}

fun main()
{
    var c=C()

    c.a()
    c.b()
    c.c()
}