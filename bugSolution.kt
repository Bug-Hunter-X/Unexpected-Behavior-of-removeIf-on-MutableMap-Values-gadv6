fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = map.filter { it.value % 2 == 0 }.keys
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}
    
    //Alternative solution using entrySet
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map2.entries.removeIf { it.value % 2 == 0 }
    println(map2) // Output: {a=1, c=3}
} 