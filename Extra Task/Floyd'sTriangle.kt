fun main()
{
    print("Enter Number For Print FLoys's Triangle : ")
    var num= readln().toInt()
    var n=1


    for(i in 1..num)
    {
        for(j in 1..i)
        {
            print("$n ")
            n++
        }
        print("\n")
    }
}