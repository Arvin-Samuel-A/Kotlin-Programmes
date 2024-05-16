import java.util.Scanner

fun main(){

    val Input = Scanner(System.`in`)

    val Terms : Long
    val Number1 : Long
    val Number2 : Long

    println("We are going to print the Fibonacci Series!!!\n")

    print("Enter the Number of Terms : ")
    Terms = Input.nextLong()
    println()

    print("Enter the First Term : ")
    Number1 = Input.nextLong()

    print("Enter the Second Term : ")
    Number2 = Input.nextLong()
    println()

    Fibonacci(Terms, Number1, Number2)

}

fun Fibonacci(Terms : Long, Num1 : Long, Num2 : Long){

    println("The Fibonacci Series till $Terms terms with First term $Num1 and Second term $Num2 is : \n")

    var Dup : Long
    var Var1 = Num1
    var Var2 = Num2

   for (x in 1..Terms){

       println(Var1)
       Dup = Var1
       Var1 = Var2
       Var2 += Dup

   }

}