fun main() {
    print("Input Your Salary : ")
    var salary = Integer.valueOf(readLine())

    if(salary < 15000){
        var prakan = (salary/100)*5
        print("Your Welfare is $prakan Bath")
    }else{
        print("Your Welfare is 750 Bath")
    }
}