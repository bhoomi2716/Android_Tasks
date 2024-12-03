fun main()
{
    var array= intArrayOf(1,2,3,4,5,6,7)
    var sum=0

    for(i in 0..array.size-1)
    {
        sum+=array[i]
    }

    println("Sum Of Array Elements : $sum")
}