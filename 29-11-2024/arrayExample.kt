fun main()
{
    var str = arrayOf("","",Int,"")

    println("Enter Your Name : ")
    str[0] = readln().toString()

    println("Enter Your EmailId : ")
    str[1] = readln().toString()

    println("Enter Your Mobile Number : ")
    str[2] = readln().toInt()

    println("Enter Your Collage Name :  ")
    str[3] = readln().toString()

    println("Your Name : ${str[0]}")
    println("Your EmailID : ${str[1]}")
    println("Your Mobile Number : ${str[2]}")
    println("Your Collage Name : ${str[3]}")

}