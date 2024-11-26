fun main()
{
    var num=12
    var blank=0

    if(num==1 || num==0)
    {
        blank=1
    }
    if(num%2==0)
    {
        blank=1
    }
    if(blank==0)
    {
        print("$num Is Prime..")
    }
    else
    {
        print("$num IS Not Prime..")
    }

}