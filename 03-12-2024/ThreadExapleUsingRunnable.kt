import javax.print.attribute.standard.OutputDeviceAssigned

class aaa : Runnable
{
    override fun run()
    {
        println("Thread aaa1")
        println("Thread aaa2")
        println("Thread aaa3")
        println("Thread aaa4")
        println("Thread aaa5")
    }
}

class bbb : Runnable
{

    override fun run()
    {
        println("Thread bbb1")
        println("Thread bbb2")
        println("Thread bbb3")
        println("Thread bbb4")
        println("Thread bbb5")
    }
}

fun main()
{
//    var InA=aaa()
//    var InB=bbb()

    var OuA=Thread(aaa())
    var OuB=Thread(bbb())

    OuA.start()
    OuB.start()
}