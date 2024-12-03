fun main()
{
    var arr= arrayOfNulls<Int>(5)

    println("Original Array :  ${arr.contentToString()}")

    arr[0]=10
    arr[arr.size-1]=20

    println("Modified Array :  ${arr.contentToString()}")
}