import java.io.FileInputStream
import java.io.FileOutputStream

fun main()
{

    println("Enter Your Name : ")
    var nm= readln().toString()

    println("Enter Your Email : ")
    var email = readln().toString()

    println("Enter Your Password : ")
    var pass= readln().toString()

    println("Enter Confirm Password : ")
    var cpass= readln().toString()

    if(pass==cpass)
    {
        var name="Your Name  : $nm"
        var mail="\nYour Email : $email"
        var createFile = FileOutputStream("D:\\Android_Tasks\\29-11-2024\\Info.txt")
        createFile.write(name.toByteArray())
        createFile.write(mail.toByteArray())

        println("File Created...!!")
    }
    else
    {
        println("Enter Password And Confirm Password Are Same...")
    }


}