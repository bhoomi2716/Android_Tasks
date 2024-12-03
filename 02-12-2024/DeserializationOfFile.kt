import java.io.FileInputStream
import java.io.ObjectInputStream

fun main()
{
    var readfile=FileInputStream("D:\\Android_Tasks\\02-12-2024\\Flower.txt")
    var read=ObjectInputStream(readfile)
    var f :Flower = read.readObject() as Flower

    println("Your Flower Name Is : ${f.name}")
    println("Your Flower Name Is : ${f.color}")
}