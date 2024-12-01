fun main()
{
    var array= intArrayOf(11,22,33,44,55)
    var evenArray= emptyArray<Int>()
    var oddArray= emptyArray<Int>()

    for(ind in 0..array.size-1)
    {
        if(array[ind]%2==0)
        {
            evenArray+=(array[ind])
        }
        else
        {
            oddArray+=(array[ind])
        }
    }

    println("original Array : ${array.contentToString()}")
    println("Array Of Even Numbers : ${evenArray.contentToString()}")
    println("Array Of Odd Number : ${oddArray.contentToString()}")
}