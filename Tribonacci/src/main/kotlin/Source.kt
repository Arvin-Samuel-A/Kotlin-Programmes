import java.util.Scanner

fun main(){

    val Input = Scanner(System.`in`)

    val Terms : Long
    val Number1 : Long
    val Number2 : Long
    val Number3 : Long

    println("We are going to print the Tribonacci Series!!!\n")

    print("Enter the Number of Terms : ")
    Terms = Input.nextLong()
    println()

    print("Enter the First Term : ")
    Number1 = Input.nextLong()

    print("Enter the Second Term : ")
    Number2 = Input.nextLong()

    print("Enter the Third Term : ")
    Number3 = Input.nextLong()
    println()

    Tribonacci(Terms, Number1, Number2, Number3)

}

fun Tribonacci(Terms : Long, Num1 : Long, Num2 : Long, Num3 : Long){

    println("The Tribonacci Series till $Terms terms with First term $Num1, Second term $Num2 and Third term $Num3 is : \n")

    var Dup1 : Long
    var Dup2 : Long
    var Var1 = Num1
    var Var2 = Num2
    var Var3 = Num3

    for (x in 1..Terms){

        println(Var1)
        Dup1 = Var1
        Dup2 = Var2
        Var1 = Var2
        Var2 = Var3
        Var3 += Dup1 + Dup2

    }

}