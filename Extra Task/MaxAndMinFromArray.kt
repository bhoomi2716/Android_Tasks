import kotlin.math.max

fun main()
{
    var arr= arrayOf(1,6,9,45,24,3,7)

    var index=arr[0]

    var min=0
    var max=0

    for(i in arr[0]..arr[6])
    {
        if(index<arr[i])
        {
            min=index
        }

        if(index>arr[i])
        {
            max=index
        }
    }

    println("Maximum Number Of Array Is : $max")
    println("Minimum Number Of Array Is : $min")

}