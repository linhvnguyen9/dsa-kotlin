package searching

/**
 * Linear search algorithm. Iterates over all elements in list until key is found.
 *
 * Loop invariant: a[0..i-1] is the list of elements that is not the search key
 * Initialization: at the start of the loop i=0, so the list of elements which is not the search key is empty
 * Maintenance: when our loop iterates over each element, it checks if that is the key or not, if so then the algorithm
 * will return position of key, otherwise it'll move on
 * Termination: when the algorithm finishes, either when we find the key in the list, or list doesn't contain key,
 * a[0..i-1] still does not contain the search key
 *
 * @return -1 if key is not in the list, position of key otherwise
 */
fun List<Int>.linearSearch(key: Int): Int {
    this.forEachIndexed { index, value ->
        if (value == key)
            return index
    }
    return -1
}