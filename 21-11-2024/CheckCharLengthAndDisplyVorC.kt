fun main()
{
    println("Enter Any Character : ")
    var char = readln().toString()

    if(char.length==1)
    {
        if(char=="a"|| char=="A"|| char=="e" || char=="E" || char=="I" || char=="i" || char=="o" || char=="O" || char=="u" || char=="U")
        {
            println("$char Is Vowel")
        }
        else
        {
            println("$char Is Consonant")
        }
    }
    else
    {
        println("Please Enter Only One Character....")
    }
}