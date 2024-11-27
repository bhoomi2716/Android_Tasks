open class a
{
    fun a()
    {
        println("this is class a")
    }
}

class b : a()
{
    fun b()
    {
        println("this is class b")
    }
}

class c : a()
{
    fun c()
    {
        println("this is class c")
    }
}

fun main ()
{
    var global=a()
    global.a()

    println("===================")

    global=b()
    global.b()

    println("===================")

    global=c()
    global.c()
}