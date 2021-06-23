package other

/**
 * Add 2 binary numbers stored in arrays of Int
 *
 * To calculate sum of the 2 numbers, we must first reverse 2 arrays
 * so that we get the least significant bit at position 0, then
 * determine the max length of 2 numbers, then iterate through each
 * bit in the longer number, adding the corresponding bit in the
 * other number. If both bits are 1, we need to carry it
 *
 * @return Sum in binary, stored in an array
 */
fun List<Int>.addBinaryArray(op2: List<Int>): List<Int> {
    val num1 = if (this.size < op2.size) this.reversed() else op2.reversed()

    var carry = 0
    val result = mutableListOf<Int>()

    num1.forEachIndexed { index, value ->
        result.add(value + op2[index] + carry)
        carry = if (value + op2[index] + carry > 1) value + op2[index] + carry - 1 else 0
    }

    return result
}