class aa : Thread()
{
    override fun run()
    {
        for(i in 1..10)
        {
            println("Thread aa : $i")
        }
    }
}

class bb : Thread()
{
    override fun run()
    {
        for(i in 1..10)
        {
            println("Thread bb : $i")
        }
    }
}


fun main()
{
    var A=aa()
    var B=bb()

    A.start()
    B.start()

}