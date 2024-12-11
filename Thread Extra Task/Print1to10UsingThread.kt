// Creating Threads: Write a Kotlin program to create two threads that print numbers from 1 to 10.
// Ensure the threads run simultaneously.

class InitializeNumber
{
       companion object
       {
           var counter =1
           fun displayNum(no : Int)
           {
               println("Thread $no")
               println("Counter Number : $counter")
               counter++
           }
       }


}

class PrintNumbers(var ino : InitializeNumber, var num : Int) : Thread()
{
    override fun run()
    {
        synchronized(ino)
        {
           InitializeNumber.displayNum(num)
        }
    }
}

fun main()
{
    var initno=InitializeNumber()

    var pnum1=PrintNumbers(initno,1)
    var pnum2=PrintNumbers(initno,2)
    var pnum3=PrintNumbers(initno,3)
    var pnum4=PrintNumbers(initno,4)
    var pnum5=PrintNumbers(initno,5)
    var pnum6=PrintNumbers(initno,6)
    var pnum7=PrintNumbers(initno,7)
    var pnum8=PrintNumbers(initno,8)
    var pnum9=PrintNumbers(initno,9)
    var pnum10=PrintNumbers(initno,10)


    pnum1.start()
    pnum1.join()

    pnum2.start()
    pnum2.join()

    pnum3.start()
    pnum3.join()

    pnum4.start()
    pnum4.join()

    pnum5.start()
    pnum5.join()

    pnum6.start()
    pnum6.join()

    pnum7.start()
    pnum7.join()

    pnum8.start()
    pnum8.join()

    pnum9.start()
    pnum9.join()

    pnum10.start()
    pnum10.join()

    //    for(i in 1..10)
//    {
//        var pnum = PrintNumbers(initno,i)
//
//        pnum.start()
//        pnum.join()
//
//    }

}