fun main()
{
    for(i in 1..5)
    {
        for(j in 5-i downTo 1)
        {
            print(" ")
        }
        for(j in 1..2*i-1)
        {
            print("*")
        }
        print("\n")
    }

    for(i in 4 downTo 1)
    {
        for(j in 5-i downTo 1)
        {
            print(" ")
        }
        for(j in 1..2*i-1)
        {
            print("*")
        }
        print("\n")
    }
}