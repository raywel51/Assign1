fun main() {
    var money = 1
    while(money != 0){
        print("\nEnter amount of money : ")
        money = Integer.valueOf(readLine())

        if( money % 100 == 0 && money != 0){
            println("$money Baht can be separated into")
            if(money >= 1000){
                var bai = money/1000
                println("1000-Baht $bai bills")
                money = money - bai*1000
            }
            if(money >= 500){
                var bai = money/500
                println("500-Baht $bai bills")
                money = money - bai*500
            }
            if(money >= 100){
                var bai = money/100
                println("100-Baht $bai bills")
                money = money - bai*100
            }
        }else{
            print("Please enter amount of money more than 100 Baht (ห้ามกรอกจำนวนเงินที่ได้เศษ 0-99 บาท)")
            money = 1
        }
    }
}
