package sorting

import java.util.*

fun List<Int>.insertionSorted() : List<Int> {
    val result = this.toMutableList()
    val startTime = Calendar.getInstance().timeInMillis
    for (j in 1 until result.size) {
        val key = result[j]
        var i = j - 1
        while (i >= 0 && result[i] > key) {
            result[i+1] = result[i]
            i--
        }
        result[i+1] = key
    }
    val endTime = Calendar.getInstance().timeInMillis
    println("Execution time ${endTime - startTime} ms")
    return result
}

fun List<Int>.insertionSortedDescending() : List<Int> {
    val result = this.toMutableList()
    val startTime = Calendar.getInstance().timeInMillis
    for (j in 1 until result.size) {
        val key = result[j]
        var i = j - 1
        while (i >= 0 && result[i] < key) {
            result[i+1] = result[i]
            i--
        }
        result[i+1] = key
    }
    val endTime = Calendar.getInstance().timeInMillis
    println("Execution time ${endTime - startTime} ms")
    return result
}