fun main()
{
    var a=10
    var b=20

    var max= a maximum b
    println("$max Is Maximum")

}

infix fun Int.maximum(num1 : Int) : Int
{
    if (this > num1)
    {
        return this
    }
    else
    {
        return num1
    }
}