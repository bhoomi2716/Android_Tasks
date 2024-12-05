fun main()
{
    println("Enter Number : ")
    var num= readln().toInt()

    for(i in 1..num)
    {
        for(j in num-i downTo 1)
        {
            print(" ")
        }
        for(j in 1..i)
        {
            print("$i ")
        }
        print("\n")
    }

}