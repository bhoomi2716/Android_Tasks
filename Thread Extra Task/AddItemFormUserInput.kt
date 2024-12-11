// Thread Communication: Implement a producer-consumer model in Kotlin using threads,
// where one thread produces items and another consumes them.


class addItem : Thread()
{
    companion object{
        var itemNum =0
    }
    fun AddItem(iname: String)
    {
        println("Your Item Name : $iname")
        itemNum++
    }
    fun noOfItem()
    {
        println("Total Number Of item: $itemNum")
    }
}

class getItem(var itemadd : addItem, var iname : String) : Thread()
{
    override fun run()
    {
        synchronized(itemadd)
        {
            itemadd.AddItem(iname)
        }
   }
}


fun main()
{
    var itemadd=addItem()

    var item1=getItem(itemadd,"Cake")
    var item2=getItem(itemadd,"Wafers")
    var item3=getItem(itemadd,"Ice Cream")
    var item4=getItem(itemadd,"Cold Drinks")

    item1.start()
    item1.join()

    item2.start()
    item2.join()

    item3.start()
    item3.join()

    item4.start()
    item4.join()

    itemadd.noOfItem()
}