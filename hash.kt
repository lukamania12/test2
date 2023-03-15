class HashTable<K, V> {
    private val table = Array<MutableList<Pair<K, V>>>(16) { mutableListOf() }

    private fun hash(key: K): Int {
        return key.hashCode() % table.size
    }

    fun put(key: K, value: V) {
        val index = hash(key)
        val bucket = table[index]

        for (i in bucket.indices) {
            if (bucket[i].first == key) {
                bucket[i] = Pair(key, value)
                return
            }
        }

        bucket.add(Pair(key, value))
    }

    fun get(key: K): V? {
        val index = hash(key)
        val bucket = table[index]

        for (pair in bucket) {
            if (pair.first == key) {
                return pair.second
            }
        }

        return null
    }

    fun remove(key: K) {
        val index = hash(key)
        val bucket = table[index]

        for (i in bucket.indices) {
            if (bucket[i].first == key) {
                bucket.removeAt(i)
                return
            }
        }
    }
}