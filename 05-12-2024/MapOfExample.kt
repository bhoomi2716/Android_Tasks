fun main()
{
    var immap= mapOf<String,String>("Rose" to "Red" , "Mogara" to "White" , "Lotus" to "Pink", "Jasmin" to "White",
        "Marigold" to "Orange")

    println("---------------------------------------")
    println("All Keys OF MapOf List : ")
    println("---------------------------------------")
    for (i in immap.keys)
    {
        println(i)
    }

    println("---------------------------------------")
    println("All Values OF MapOf List : ")
    println("---------------------------------------")
    for (i in immap.values)
    {
        println(i)
    }

    println("---------------------------------------")
    println("All Entries Of MapOF List : ")
    println("---------------------------------------")
    //println(immap)
    for(i in immap.entries)
    {
        println(i)
    }
}