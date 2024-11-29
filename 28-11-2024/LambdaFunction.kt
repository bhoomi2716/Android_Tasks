class info
{
    fun display(no : Int, name : String, data : (Int,String)->Unit)
    {
        data(no,name)
    }
}

fun main()
{
    var i=info()

    var printinfo : (Int, String)->Unit = {no:Int, name:String -> println("$no, $name") }

    i.display(101, "abc", printinfo)
}