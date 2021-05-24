package searching

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import sorting.insertionSorted
import kotlin.test.assertEquals

internal class LinearSearchTest {
    @Test
    fun `Linear search on key not in list`() {
        val data = IntRange(1, 10).toList()

        println("10 elements")

        assertEquals(-1, data.linearSearch(11))
    }

    @Test
    fun `Linear search on key in list`() {
        val data = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val unsortedList = data.shuffled()

        println("10 elements")

        assertEquals(4, data.linearSearch(5))
    }
}