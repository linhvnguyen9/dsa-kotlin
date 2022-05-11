package sorting

/**
 * Quicksort algorithm with the last item as pivot
 *
 * Divide and conquer
 * Worst case: O(n^2)
 * Avg case: O(n log n)
 * Space complexity: O(n)
 * Is stable = false for this implementation. Other implementation can be stable
 * Is in-place sort = true
 */
fun MutableList<Int>.quicksort(low: Int, high: Int) {
    if (low < high) {
        val p = partition(low, high)

        quicksort(low, p - 1)
        quicksort(p + 1, high)

        println("this[p] ${this[p]} list $this")
    }
}

fun MutableList<Int>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun MutableList<Int>.partition(low: Int, high: Int): Int {
    val pivot = this[high]
    var i = low - 1

    for (j in low until high) {
        if (this[j] < pivot) {
            i++ // Increase i to find position of pivot
            swap(i, j) // Swap to make sure that elements on the left is smaller than pivot
        }
    }
    swap(i + 1, high) // Bring the pivot in place

    return i + 1
}

fun main() {
    val input = listOf(1, 5, 7, 7, 4, 2, 6, 89, 0, 6, 4, 2, 34, 6, 897, 654)
    input.toMutableList().quicksort(0, input.lastIndex)
    println(input)
}