package functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3
fun mul(x: Int, y: Int) = x * y                                     // 3
fun div(x: Int, y: Int) = x / y                                     // 3

val double = { i: Int, _: Any? -> sum(i, i) }
val square = { i: Int, _: Any? -> mul(i, i) }

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
    println(calculate(2, 0, double))
    println(calculate(3, 0, square))
    println(calculate(8, 4, ::div))
}