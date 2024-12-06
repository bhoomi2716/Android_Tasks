import java.util.Vector

fun main()
{
    var vec=Vector<String>(3)

    vec.addElement("abc")
    vec.addElement("pqr")
    vec.addElement("xyz")

    println("Capacity OF Vector : ${vec.capacity()}")
    println("Size Of Vector : ${vec.size}")
    println("--------------------------------------")
    vec.addElement("asd")
    println("Capacity OF Vector : ${vec.capacity()}")
    println("Size Of Vector : ${vec.size}")

}