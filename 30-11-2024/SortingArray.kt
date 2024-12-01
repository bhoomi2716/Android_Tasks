fun main()
{
    var array= intArrayOf(45, 23, 78, 12, 56)
    var blank=0

    println("Original Array : ${array.contentToString()}")

    for(i in 0..array.size-1)
    {
        for(j in i+1..array.size-1)
        {
            if(array[i]>array[j])
            {
                blank=array[i]
                array[i]=array[j]
                array[j]=blank
            }
        }
    }

    println("Sorted Array : ${array.contentToString()}")


}