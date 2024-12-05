fun main()
{
    println("Enter Starting Range : ")
    var start= readln().toInt()

    println("Enter Ending Range : ")
    var end= readln().toInt()

    for(realno in start..end)
    {
        var rno=realno
        var length = realno.toString().length
        var sum=0

        while(rno!=0)
        {
            var rem=rno%10
            var add=1

            for(i in 1..length)
            {
                add*=rem
            }
            sum+=add
            rno/=10
        }
        if(realno==sum)
        {
            println("$realno, ")
        }
    }
}