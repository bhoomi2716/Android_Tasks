fun main()
{
    var arr= IntArray(10){5}

    println("Default Array : ${arr.contentToString()}")

    for(i in 0..arr.size-1)
    {
        if(i==3)
        {
           arr[i]*=10
            break
        }
    }

    println("Modified Array : ${arr.contentToString()}")
}