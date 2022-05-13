fun main() {
    var num1 = 0;
    var num2 = 1;
    var num3 = 1;

    print("Enter a Fibonanci : ")
    var r = Integer.valueOf(readLine())

    println("Calculating...")
    println("f0 = $num1")
    println("f1 = $num2")


    for (i in 2..r){
        num3 = num1 + num2
        println("f$i = $num3")

        num1 = num2
        num2 = num3
    }
    print("Value of Fibonanci is $num3")

}