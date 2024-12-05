class flower
{
    fun display (fname : String, fcolour: String)
    {
        println("Flower Name : $fname")
        println("Flower Colour : $fcolour")
    }
}

class floweruser(var flo : flower, var fname: String, var fcolour: String) : Thread()
{
    override fun run()
    {
        synchronized(flo)
        {
            flo.display(fname, fcolour)
        }
    }

}

fun main()
{
    var f=flower()
    var f1=floweruser(f,"Mogara","white")
    var f2=floweruser(f,"Lotus","Pink")
    var f3=floweruser(f,"Rose","Red")


    f1.start()
    f1.join()
    f2.start()
    f2.join()
    f3.start()
    f3.join()

}