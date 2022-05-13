fun main() {
    print("Enter a number : ")
    var number = Integer.valueOf(readLine())

    for (i in 1..number){
        var sum = 1
        print("$i! = ")

        for (i in 1..i){
            sum *= i
        }
        println("$sum")
    }
}