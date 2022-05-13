fun main() {
    print("Input Value a : ")
    var a = Integer.valueOf(readLine())

    print("Input Value b : ")
    var b = Integer.valueOf(readLine())

    print("Input Value c : ")
    var c = Integer.valueOf(readLine())

    if(a >= b && a >= c) {
        println("Max value is 'A'")
    }
    if(b >= a && b >= c) {
        println("Max value is 'B'")
    }
    if(c >= a && c >= c) {
        println("Max value is 'C'")
    }
}