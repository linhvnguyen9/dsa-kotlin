package sorting

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class InsertionSortTest {

    @Test
    fun `Insertion sort with 10 elements`() {
        val data = IntRange(1, 10).toList()
        val unsortedList = data.shuffled()

        println("10 elements")

        assertEquals(data, unsortedList.insertionSort())
    }

    @Test
    fun `Insertion sort with 10_000 elements`() {
        val data = IntRange(1, 10_000).toList()
        val unsortedList = data.shuffled()

        println("10_000 elements")

        assertEquals(data, unsortedList.insertionSort())
    }

    @Test
    fun `Insertion sort with 50_000 elements`() {
        val data = IntRange(1, 50_000).toList()
        val unsortedList = data.shuffled()

        println("50_000 elements")

        assertEquals(data, unsortedList.insertionSort())
    }
}