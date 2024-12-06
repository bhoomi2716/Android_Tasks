fun main()
{
    var Mmap= mutableMapOf<String,String>("Apple" to "Red" , "Mango" to "Orange" , "Watermelon" to "Green", "Banana" to "Yellow")

    Mmap.put("Graps","Black")

    println("===============================================")
    println("All Keys OF Mutable MapOf List : ")
    println("===============================================")
    for (i in Mmap.keys)
    {
        println(i)
    }

    println("===============================================")
    println("All Values OF Mutable MapOf List : ")
    println("===============================================")
    for (i in Mmap.values)
    {
        println(i)
    }

    println("===============================================")
    println("All Entries Of Mutable MapOF List : ")
    println("===============================================")
    //println(Mmap)
    for(i in Mmap.entries)
    {
        println(i)
    }
}