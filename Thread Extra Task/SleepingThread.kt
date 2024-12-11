// Thread Sleep: Write a program where a thread prints a message every 2 seconds for 5 iterations.

class Iteration
{
    fun display()
    {
        for(i in 1..5)
        {
            println("Iteration : $i")
            Thread.sleep(2000)
        }
    }
}
class SleepThread(var ino : Iteration) : Thread()
{
    override fun run()
    {

        synchronized(ino)
        {
            ino.display()
        }
    }
}

fun main()
{
    var iterationNumber = Iteration()
    var st= SleepThread(iterationNumber)

    st.start()
}