fun main()
{
    var array= intArrayOf(15, 4, 30, 8, 20, 10, 25)
    var min=array[0]
    var max=array[0]

    for(i in 0..array.size-1)
    {
        if(array[i]<min)
        {
            min=array[i]
        }
        if(array[i]>max)
        {
            max=array[i]
        }
    }

    println("Minimum Of Array : $min")
    println("Maximum Of Array : $max")
}