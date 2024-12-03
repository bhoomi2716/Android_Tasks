fun main()
{
    var arr= arrayOf(0,1,2,3,4,5)

    println("Original Array : ${arr.contentToString()}")
    for(i in 0..arr.size-1)
    {
        arr[i]=i*i
    }

    println("Modified Array : ${arr.contentToString()}")
}