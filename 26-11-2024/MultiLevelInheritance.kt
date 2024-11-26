open class A1
{
    fun a()
    {
        println("A Is Call")
    }
}

open class B1 : A1()
{
    fun b()
    {
        println("B Is Call")
    }
}

class C1 : B1()
{
    fun c()
    {
        println("C Is Call")
    }
}

fun main()
{

    var c=C1()
    c.a()
    c.b()
    c.c()
}