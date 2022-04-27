fun main(args: Array<String>) {
    println("Hello World!")
    println(solution(mutableListOf(8, 5, 6, 7, 5), 1, 3))
}

fun solution(numbers: MutableList<Int>, left: Int, right: Int): MutableList<Boolean> {
    var bool = false
    val result = mutableListOf<Boolean>()
    for (i in 0 until numbers.size) {
        for (j in left..right) {
            bool = (i + 1) * j == numbers[i]
            if (bool) break
        }
        result.add(bool)
    }
    return result
}
