fun main(){
    val CakeLight = ","
    val CakeCandles = "|"
    val CakeTop = "="
    val CakeBottom = "@"
    val age = 24
    val layer = 5

printBorder(CakeLight,age)
printBorderCandles(CakeCandles,age)
printBorderTop(CakeTop, age)
printBorderBottom(CakeBottom,layer,age)
}

fun printBorder(CakeLight:String, age:Int){
    repeat(age){
    print(CakeLight)
    }
    println()
}

fun printBorderCandles(CakeCandles:String, age:Int){
    repeat(age){
    print(CakeCandles)
    }
    println()
}

fun printBorderTop(CakeTop:String, age:Int){
    repeat(age){
        print(CakeTop)
    }
    println()
}

fun printBorderBottom(CakeBottom:String, layer:Int, age:Int){
	repeat(layer){
    	repeat(age){
    print(CakeBottom)
    }
    println()
}
}
    
