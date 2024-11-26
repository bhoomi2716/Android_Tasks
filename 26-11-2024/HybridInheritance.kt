open class parent
{
    fun parent()
    {
        println("This Is Parent")
    }
}

open class child1 : parent()
{
    fun child1()
    {
        println("This Is 1st Child")
    }
}

interface child2
{
    fun child2()
    {
        println("This Is 2nd Child")
    }
}

class AnotherChild : child1(), child2
{
    fun AnotherChild()
    {
        println("This Is AnotherChild")
    }
}


fun main()
{
    var ac=AnotherChild()

    ac.child1()
    ac.child2()
    ac.parent()
    ac.AnotherChild()

    println("---------------------------------------")

    var c1=child1()
    c1.child1()
    c1.parent()


}