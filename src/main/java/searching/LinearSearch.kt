package searching

fun List<Int>.linearSearch(key: Int): Int {
    this.forEachIndexed { index, value ->
        if (value == key)
            return index
    }
    return -1
}