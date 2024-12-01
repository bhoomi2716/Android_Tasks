fun main()
{
    var array= arrayOfNulls<String>(3)

    for(i in 0..2)
    {
        println("Enter Name $i ")
        var name= readln().toString()
        array[i]+=name
    }

    println(array.contentToString())

    println("Enter A Name Which You Want To Search")
    var takename= readln().toString()

    for (i in 0..2)
    {
        if(array[i]==takename)
        {
            println("Your Searched Name Is On $i Index")
            break
        }
    }
//    println("Your Searched Name Is Not Exists In This Array.... ")
}