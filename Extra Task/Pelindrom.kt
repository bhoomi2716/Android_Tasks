fun main()
{

    var num=123
    var rev=0
    var no=num

    while (num!=0)
    {
        var rem=num%10
        rev=rev*10+rem
        num/=10
    }

    if(no==rev)
    {
        print("$no Is Palindrome...")
    }
    else
    {
        print("$no Is Not Palindrome")
    }
}