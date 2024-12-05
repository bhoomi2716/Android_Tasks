fun main()
{
    println("Enter Range : ")
    var range= readln().toInt()

    var num1=0
    var num2=1
    var element= IntArray(range)
    var reveceseries=element
    var start=0
    var end=element.size-1
    var blank=0

    element[0]=num1
    element[1]=num2

    for(i in 2..range-1)
    {
        var num3=num1+num2
        element[i]=num3
        num1=num2
        num2=num3

    }

    println("Fibonacci Series : ${element.contentToString()}")

    while(start<end)
    {
        blank=element[start]
        reveceseries[start]=element[end]
        reveceseries[end]=blank
        start++
        end--
    }

    println("Reversed Fibonacci Series : ${reveceseries.contentToString()}")
}