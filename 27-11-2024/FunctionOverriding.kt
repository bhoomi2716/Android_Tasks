open class remote
{
    open fun operate()
    {
        println("Remote Is On")
    }
}

class TV : remote()
{
    override fun operate()
    {
        println("This Is TV Remote...")
        println("Remote Is On")
    }
}

class AC : remote()
{
    override fun operate()
    {
        println("This Is AC Remote...")
        println("Remote Is On")
    }
}

fun main()
{
    var tv=TV()
    var ac=AC()

    tv.operate()
    println("-----------------------")
    ac.operate()
}