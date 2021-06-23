package sorting

/**
 * Bubble sorting algorithm
 *
 * Worst case: O(n^2)
 * Avg case: O(n^2)
 * Space complexity: O(1)
 * Is stable = true
 * Is in-place sort = true
 */
fun List<Int>.bubbleSort() : List<Int> {
    val list = this.toMutableList()

    for (i in 0 until list.size) {
        for (j in i until list.size) {
            if (list[i] > list[j]) {
                val temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }

    return list
}

fun main() {
    val input = listOf(1,5,7,7,4,2,6,89,0,6,4,2,34,6,897,654)
    println(input.bubbleSort())
}