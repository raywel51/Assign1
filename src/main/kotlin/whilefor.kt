import java.lang.Math.abs

fun main() {

    println("\nSequence1")
    Sequence1()
    println("\nSequence2")
    Sequence2()
    println("\nSequence3")
    Sequence3()
}

fun Sequence1(){
    var sum = 10
    var result = 0

    //for loop Sequence1//
        for (i in sum downTo 1){
            result += i
            print("$i ")
        }
    println("\nSum = $result")

    sum = 10
    result = 0

    //while loop Sequence1//
    while (sum != 0) {
        result += sum
        print("$sum ")
        sum--
    }
    println("\nSum = $result")
}

fun Sequence2(){
    var sum = 1
    var result = 0

    //for loop Sequence2//
    for (i in 1..10){
        result += sum
        print("$sum ")
        sum = sum+2
    }
    println("\nSum = $result")

    sum = 1
    result = 0

    //while loop Sequence2//
    while (sum != 21) {
        print("$sum ")
        result += sum
        sum = sum+2
    }
    println("\nSum = $result")
}

fun Sequence3(){
    var sum = 1
    var result = 0

    //for loop Sequence2//
    for (i in 1..10){

        if(i%2 != 0){
            print("$sum ")
            result += sum
            sum = sum+2
        }else{
            sum *= -1
            result += sum
            print("$sum ")
            sum = Math.abs(sum)+2 //absolute
        }

    }
    println("\nSum = $result")

    sum = 1
    result = 0
    var i = 0

    //while loop Sequence3//
    while (sum != 21) {

        i++
        if(i%2 != 0){
            print("$sum ")
            result += sum
            sum = sum+2
        }else{
            sum *= -1
            result += sum
            print("$sum ")
            sum = Math.abs(sum)+2 //absolute
        }
    }
    println("\nSum = $result")
}