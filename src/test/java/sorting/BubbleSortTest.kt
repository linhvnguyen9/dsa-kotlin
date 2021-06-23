package sorting

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class BubbleSortTest {

    @Test
    fun `Bubble sort with 10 elements`() {
        val data = IntRange(1, 10).toList()
        val unsortedList = data.shuffled()

        println("10 elements")

        assertEquals(data, unsortedList.bubbleSort())
    }

    @Test
    fun `Bubble sort with 10_000 elements`() {
        val data = IntRange(1, 10_000).toList()
        val unsortedList = data.shuffled()

        println("10_000 elements")

        assertEquals(data, unsortedList.bubbleSort())
    }

    @Test
    fun `Bubble sort with 50_000 elements`() {
        val data = IntRange(1, 50_000).toList()
        val unsortedList = data.shuffled()

        println("50_000 elements")

        assertEquals(data, unsortedList.bubbleSort())
    }
}