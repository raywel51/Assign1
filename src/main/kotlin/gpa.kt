fun main() {

    print("Input Your Score : ")
    var score = Integer.valueOf(readLine())

    if(score > 100 || score < 0) {
        print("Your grade is")
    }else if(score >= 80){
        print("Your grade is A")
    }else if(score >= 75){
        print("Your grade is B+")
    }else if(score >= 70){
        print("Your grade is B")
    }else if(score >= 65){
        print("Your grade is C+")
    }else if(score >= 60){
        print("Your grade is C")
    }else if(score >= 55){
        print("Your grade is D+")
    }else if(score >= 50){
        print("Your grade is D")
    }else{
        print("Your grade is F")
    }
}