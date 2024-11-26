open class AAA
{
    fun A()
    {
        println("I am A!!")
    }
}

class BBB : AAA()
{
    fun B()
    {
        println("I am B!!")
    }
}

class CCC : AAA()
{
    fun C()
    {
        println("I am C!!")
    }
}

fun main()
{
    var B=BBB()
    B.A()
    B.B()

    println("----------------")

    var C=CCC()
    C.A()
    C.C()
}