open class shape(value1 : Int, value2: Int)
{
    var value1=value1
    var value2=value2
    fun display()
    {
        println("This is Shape Class")
    }
}


class Triangle(value1 : Int, value2 : Int ) : shape(value1,value2)
{
    var base=value1
    var height=value2

    fun AreaOfTriangle()
    {
        var area=(base*height)/2
        println("Area Of Triangle Is : $area")
    }
}

class Rectangle(value1: Int, value2: Int) : shape(value1,value2)
{
    var length=value1
    var width=value2

    fun AreaOfRectangle()
    {
        var area=length*width
        println("Area Of Rectangle Is : $area")
    }
}

fun main()
{
    println("Enter Value 1 : ")
    var value1= readln().toInt()

    println("Enter Value 2 : ")
    var value2= readln().toInt()

    var tri=Triangle(value1,value2)
    tri.display()
    tri.AreaOfTriangle()

    println("--------------------------------------------")

    var rec=Rectangle(value1,value2)
    rec.display()
    rec.AreaOfRectangle()
}