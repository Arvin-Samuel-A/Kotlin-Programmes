import java.util.Scanner
import kotlin.math.sqrt
import java.util.concurrent.locks.ReentrantLock
import java.util.Vector

var Sum = 2L
val Mutex = ReentrantLock()

fun main(){

    val Input = Scanner(System.`in`)
    val Limit : Long

    println("We are going to Calculate the Sum of Prime Numbers till the user-entered limit!!!\n")

    print("Enter the Limit : ")
    Limit = Input.nextLong()
    println()

    Threading(Limit)

    println("The Sum of Primes till $Limit is : $Sum")

}

fun Threading(Dup : Long){

    var Var = (Dup-2).toDouble()
    Var /= 12

    val Threads = Vector<Thread>(12)

    for (x in 0..11){

        val Obj = Primes((x*Var+3).toLong(), ((x+1)*Var+3).toLong())
        Threads.add(Obj)
        Obj.start()

    }

    for (th in Threads){

        th.join()

    }

}

class Primes(var Num1 : Long, var Num2 : Long) : Thread(){

    var Total = 0L

    override fun run(){

        var Dup : Long

        for (x in Num1..<Num2){

            if (x % 2 != 0L){

                Dup = sqrt(x.toDouble()).toLong() + 1

                var Found = true
                var y = 3L

                while (y < Dup){

                    if (x % y == 0L) {

                        Found = false
                        break

                    }

                    y+=2

                }

                if (Found){

                    Total+=x

                }

            }

        }

        Mutex.lock()
        Sum+=Total
        Mutex.unlock()

    }

}