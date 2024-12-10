fun main()
{
    println("Enter Size Of Matrix : ")
    var n= readln().toInt()

    val matrix = Array(n) { IntArray(n) }

    var top = 0
    var bottom = n-1
    var left = 0
    var right = n-1
    var num = 1

    while (top <= bottom && left <= right)
    {
        for (i in left..right)
        {
            matrix[top][i] = num
            num++
        }
        top++

        for (i in top..bottom) {
            matrix[i][right] = num
            num++
        }
        right--

        if (top <= bottom)
        {
            for (i in right downTo left)
            {
                matrix[bottom][i] = num
                num++
            }
            bottom--
        }

        if (left <= right)
        {
            for (i in bottom downTo top)
            {
                matrix[i][left] = num
                num++
            }
            left++
        }
    }

    for (row in matrix) {
        println(row.joinToString("  ") { it.toString().padStart(2, ' ') })
    }

}
