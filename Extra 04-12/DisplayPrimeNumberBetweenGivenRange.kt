fun main()
{
    println("Enter Starting Range : ")
    var start= readln().toInt()

    println("Enter Ending Range : ")
    var end= readln().toInt()

    var PrimeNumber= emptyArray<Int>()

    for(outerno in start..end)
    {
        if (outerno <= 2)
        {
            continue
        }

        var isPrime=true

        for(inerno in 2..outerno/2)
        {
            if(outerno%inerno==0)
            {
                isPrime=false
                break
            }
        }

        if (isPrime)
        {
         // print("$outerno, ")
            PrimeNumber+=(outerno)
        }
    }

 println("Your Prime Numbers Between $start And $end Is : ${PrimeNumber.contentToString()}")
}