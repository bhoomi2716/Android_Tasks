import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class Flower(var name : String, var color: String) : Serializable
{

}

fun main()
{
    println("Enter flower Name : ")
    var name= readln().toString()
    println("Enter Flower colour Name : ")
    var color= readln().toString()

    var f=Flower(name,color)
    var writeFile=FileOutputStream("D:\\Android_Tasks\\02-12-2024\\Flower.txt")
    var write=ObjectOutputStream(writeFile)
    write.writeObject(f)

    println("File Creation... Success!!!")
}