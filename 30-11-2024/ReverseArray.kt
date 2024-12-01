fun main()
{
    var array= intArrayOf(1,2,3,4,5)
    var start=0
    var end=array.size-1
    var blank=0
    var reversearray= array

    println("Original Array : ${array.contentToString()}")

    while(start<end)
    {
        blank=array[start]
        reversearray[start]=array[end]
        reversearray[end]=blank

        start++
        end--
    }

    println("Reversed Array : ${reversearray.contentToString()}")
}
