import java.util.Scanner

fun main(){

    val Input = Scanner(System.`in`)
    val Number : Long

    println("We are going to Calculate the Factorial of the user-entered Number!!!\n")

    print("Enter the Number to Calculate it's Factorial : ")
    Number = Input.nextLong()
    println()

    println("The Factorial of $Number is : ${Factorial(Number)}")

}

fun Factorial(Num : Long) : Long{

    return (if (Num>1) Num*Factorial(Num-1) else 1)

}