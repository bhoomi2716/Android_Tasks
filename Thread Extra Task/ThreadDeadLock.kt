class deadlock : Thread()
{
    init
    {
        println("Initialize Thread.....")
    }
    override fun run()
    {
        println("Thread Running.....")
    }
    fun destroy()
    {
        println("DeadLock Of Thread.....")
    }
}

fun main()
{
    var dead=deadlock()
    dead.start()
    dead.join()
    dead.destroy()
}