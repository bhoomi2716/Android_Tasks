fun main()
{
    var array = emptyArray<String>()

    for(i in 0..2)
    {
        println("Enter Name $i ")
        val name = readLine().toString()
        array+=name
    }

    println(array.contentToString())

    println("Enter A Name Which You Want To Search")
    var takename= readln().toString()

    if(takename in array)
    {
        println("Your Entered Name Is Exist In Array")
    }
    else
    {
        println("Your Entered Name Does not Exist In Array ")
    }

}