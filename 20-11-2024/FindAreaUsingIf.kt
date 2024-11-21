fun main()
{
    var ch=1

//    println("Which Operation You Want To Perform")
//    println("1. Area Of Triangle")
//    println("2. Area Of Rectangle")
//    println("3. Area Of Circle")

    if(ch==1)
    {
        var base=5
        var height=8
        var AreaOFTriangle = (base*height)/2
        println("Area Of Triangle Is : $AreaOFTriangle")
    }

    if(ch==2)
    {
        var length=3
        var width=6
        var AreaOFRectangle = length*width
        println("Area Of Rectangle Is : $AreaOFRectangle")
    }

    if(ch==3)
    {
        var redius=9
        val pi=3.14
        var AreaOfCircle = pi*redius*redius
        println("Area Of Circle Is : $AreaOfCircle")
    }

}