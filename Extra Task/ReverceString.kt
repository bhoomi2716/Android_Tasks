fun main()
{
    println("Enter A String : ")
    var str= readln().toString()
    var reverseString =" "

    for (ch in str) {
        reverseString = ch + reverseString
    }
    println(reverseString)
}