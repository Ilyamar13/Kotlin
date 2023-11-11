fun main() {
    sum(10,15)
    composition(3,3,3)
    greet("Ilya")
}
fun sum(num1: Int, num2:Int){
    println(num1 + num2)  
}
fun composition(num1: Int, num2:Int, num3: Int){
    println(num1 * num2 * num3)  
}
fun greet(name:String){
    println("Hello ${name}")
}

class Calculator {
    fun add(a: Int, b: Int): Int {        return a + b
}
    fun multiply(a: Int, b: Int, c: Int): Int {         return a * b * c 
} }

fun main(){
    sum(10,15)
    sum(1.4,1.5)
    composition(3,3,3)
    composition(3.5,6.7,7.8)
    greet("Ilya")
    val calculator = Calculator()    
    val result1 = calculator.add(5, 7)
    println("Сумма: $result1")    
    val result2 = calculator.multiply(2, 3, 4)     
    println("Произведение: $result2") 

}
fun sum(num1: Int, num2:Int){
    println(num1 + num2)  
}
fun sum(num1: Double, num2:Double){
    println(num1 + num2)  
}
fun composition(num1: Int, num2:Int, num3: Int){
    println(num1 * num2 * num3)  
}
fun composition(num1: Double, num2:Double, num3: Double){
    println(num1 * num2 * num3)  
}
fun greet(name:String){
    println("Hello ${name}")
}
