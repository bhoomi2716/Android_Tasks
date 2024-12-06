fun main()
{
    var imset= setOf(1,2,3,"a","b","c","a")
    var mset= mutableSetOf(101,102,103,"abc","xyz","pqr",101)

    println("Size Of SetOf : ${imset.size}")
    print("Element ->  ")
    for(i in imset)
    {
        print("$i ")
    }
    println()

    mset.add(104)
    mset.remove("abc")

    println("Size Of Mutable SetOf : ${mset.size}")
    print("Element ->  ")
    for(i in mset)
    {
        print("$i ")
    }
}