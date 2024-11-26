fun main()
{
    var num=123
    var rev=0

    while (num!=0)
    {
        var rem=num%10
        rev=rev*10+rem
        num/=10
    }

    print(rev)
}