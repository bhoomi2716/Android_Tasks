fun main()
{
    var imlist= listOf(1,2,3,"a","b","c")
    var mlist= mutableListOf(101,102,103,"abc","xyz","pqr")

    for(i in imlist)
    {
        print("$i ")
    }
    println()

    mlist.add(104)
//    mlist.remove("abc")
    mlist.removeAt(2)


    for(i in mlist)
    {
        print("$i ")
    }
}