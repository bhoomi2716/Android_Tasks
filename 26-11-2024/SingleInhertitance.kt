open class A
{
    fun a()
    {
        println("A Is Call")
    }
}

open class B : A()
{
    fun b()
    {
        println("B Is Call")
    }
}

fun main()
{
    var b=B()

    b.a()
    b.b()
}