import java.util.Scanner
fun main() {
    print("Input P : ")
    var p = Integer.valueOf(readLine())

    print("Input q : ")
    var q = Integer.valueOf(readLine())

    print("$p XOR $q = ")
    println(p xor q)

/*if(p == 0 && q == 0) {
    print("$p XOR $q = 0")
}else if(p == 0 && q == 1){
    print("$p XOR $q = 1")
}else if(p == 1 && q == 0){
    print("$p XOR $q = 1")
}else{
    print("$p XOR $q = 0")
}*/
}