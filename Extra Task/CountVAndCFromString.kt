fun main()
{
    println("Enter String : ")
    var str= readln().toString()
    var vowel=0
    var consonant=0

//    var char = str.length
    for (Split in 0 until str.length)
    {
            if(str[Split]=='a' || str[Split]=='A' || str[Split]=='e' || str[Split]=='E' || str[Split]=='i' || str[Split]=='I' || str[Split]=='o' || str[Split]=='O' || str[Split]=='u' || str[Split]=='U')
            {
                vowel++
            }
            else
            {
                consonant++
            }
    }

    println("Total Vowel In String Is : $vowel")
    println("Total Consonants In String Is : $consonant")

}


