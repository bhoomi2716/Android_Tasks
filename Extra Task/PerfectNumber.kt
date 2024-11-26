fun main()
{
    var num=28
    var rem=0
    var sum=0

    for(i in 1..<num)
    {
        rem=num%i
        if(rem==0)
        {
            sum+=i
        }
    }
    if(sum==num)
    {
        print("$num Is Perfect Number")
    }
    else
    {
        print("$num Is Not Perfect Number")
    }
}