fun main()
{
    var num=1234
    var rem=0
    var count=0

    while(num>0)
    {
        rem=num%10
        count++
        num/=10
    }

    println("Total Digit Of Number $num Is : $count")
}