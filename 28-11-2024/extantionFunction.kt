class animal
{
    fun sound()
    {
        println("I can Speak")
    }
}

fun animal.eat()
{
    println("I can Eat")
}

fun main()
{
    var a=animal()

    a.sound()
    a.eat()
}