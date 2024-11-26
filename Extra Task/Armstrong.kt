fun main()
{
    var num=153
    var blank=num
    var rem=0
    var sum=0

    while(num>0)
    {
        rem=num%10
        sum=sum+(rem*rem*rem)
        num/=10
    }

    if(blank==sum)
    {
        println(" $blank Is Armstrong Number")
    }
    else
    {
        println(" $blank Is Not Armstrong Number")
    }
}