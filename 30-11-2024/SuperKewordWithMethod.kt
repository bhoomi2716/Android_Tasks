open class base
{
    open fun printdata()
    {
        println("I Am Base Class")
    }
}

class derived : base()
{
    override fun printdata()
    {
        println("I Am Derived Class")
        super.printdata()
    }
}


fun main()
{
    var d=derived()
    d.printdata()
}