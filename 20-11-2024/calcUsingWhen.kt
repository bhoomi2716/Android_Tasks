fun main()
{
    var ch=1
    var num1=7
    var num2=3

    var add=num1+num2
    var sub=num1-num2
    var mul=num1*num2
    var div=num1/num2

//    println("Which Operation You Want To Perform ? ")
//    println("1. Addition")
//    println("2. Subtraction")
//    println("3. Multiplication")
//    println("4. Division")

    when(ch)
    {
        1-> print("Addition Is : $add")
        2-> print("Subtraction Is : $sub")
        3-> print("Multiplication Is : $mul")
        4-> print("Division Is : $div")
    }
}