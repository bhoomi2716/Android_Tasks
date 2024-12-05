class fruits
{
    fun display (frname : String, frcolour: String)
    {
        println("Flower Name : $frname")
        println("Flower Colour : $frcolour")
    }
}

class fruitsuser(var fru : fruits, var frname: String, var frcolour: String) : Runnable
{
    override fun run()
    {
        synchronized(fru)
        {
            fru.display(frname, frcolour)
        }
    }
}

fun main()
{
    var fr=fruits()

    var fr1=Thread(fruitsuser(fr,"Mango","Orange"))
    var fr2=Thread(fruitsuser(fr,"Apple","Red"))
    var fr3=Thread(fruitsuser(fr,"Kivi","Green"))

    fr1.start()
    fr1.join()
    fr2.start()
    fr2.join()
    fr3.start()
    fr3.join()
}