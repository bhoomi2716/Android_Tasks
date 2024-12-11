
fun main()
{
    var max_priority = Thread {
        for(i in 1..5)
        {
            println(i)
        }

    }
    var min_priority = Thread{
         for(i in 1..5)
         {
             println(i)
         }

    }

    var max = Thread.MAX_PRIORITY
    var min = Thread.MIN_PRIORITY

    println(" Max Priority : $max_priority $max")
    println(" Min Priority : $min_priority $min")


}