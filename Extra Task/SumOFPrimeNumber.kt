fun main() {

    var sum = 0

    for (no in 2..100)
    {
        var blank= true
        for(i in 2..no/2)
        if (no % i == 0)
        {
            blank = false
            break
        }
        if(blank)
        {
            sum+=no
        }
    }

    println("Sum Of Numbers Between 1 to 100 Is : $sum")


}
