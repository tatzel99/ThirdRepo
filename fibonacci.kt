fun printFibonacci(n: Int) {
    var t1 = 0
    var t2 = 1

    for (i in 1..n) {
        print("$t1, ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

fun main() {
    print("Enter the number of terms: ")
    val n = readLine()?.toIntOrNull() ?: 0
    printFibonacci(n)
}
