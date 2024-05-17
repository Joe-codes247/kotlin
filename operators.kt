fun main(){

    var maths = 80
    var english = 70
    var bio = 100
    var chem = 60
    var kis = 55

    var sum = maths + english + bio + chem + kis
    println("The answer is " + sum)

iff()
test()
grade()

}

fun iff(){

    var mathematics = 50

    if(mathematics < 40){

        println("Failed")


    } else if (mathematics > 40) {
        println("Pass")



    } else{
        println("Average")

    }


}

fun test(){

    var number = -6

    if(number > 0){
        println("Positive number")



    } else if(number == 0){
        println("Number is Zero")


    } else{
        println("Negative number")

    }


}

fun grade(){

    var bio = -806
    var phyc = -803
    var eng = -703
    var kis = -820
    var geo = -180

    var  n = (bio + phyc + eng + kis + geo)/5
    println(n)

    if(n>=0 && n<=15){
        println("E")
    } else if (n>=16 && n<=25){
        println("D")
    }  else if (n>=26 && n<=50){
        println("C")
    }  else if (n>=51 && n<=70){
        println("B")
    } else if (n>=71 && n<=100){
        println("A")
    } else if (n>100){
        println("Invalid")
    } else if (n<0){
        println("Infinity")
    }





//if(n >= 90){
//    println("A")
//
//} else if(n >= 70){
//    println("B")
//
//} else if(n >= 50){
//    println("C")
//
//} else if(n >= 40){
//    println("D")
//
//} else if(n > 100){
//    println("Invalid")
//
//} else if(n < 0){
//    println("Valid")
//
//} else {
//    println("E")
//
//}
//
//

}



















