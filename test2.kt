fun singleNumber(nums: IntArray): Int {
    val s = ar1.size
    for (i in 0 until s - 1) {
        for (j in 0 until s - i - 1) {
            if (ar1[j] > ar1[j + 1]) {
                val temp = ar1[j]
                ar1[j] = ar1[j + 1]
                 ar1[j + 1] = temp
            }
         }
     }
    if (ar1[0] != ar1[1]) {
        return ar1[0]
    } else if (ar1[ar1.lastIndex] != ar1[ar1.lastIndex - 1]) {
        return ar1.last()
    }

    return -1

}


fun minSplit(amount : Int) : Int {
    val coins = intArrayOf(50,20,10,5,1)
    var remains = amount
    var result = 0
    for (coin in coins) {
        result += remains / coin
        remains %= coin
        if (remains == 0) break
    }
    return result

fun notContains(arr: IntArray): Int {
    for (i in 0 until arr.size - 1) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
    val k = arr.count()
    var result = 1
    for (j in 0..k) {
        if (j !in arr ) {
            result = j
            break
        }
    }
    return result
}

fun countVariants(stairsCount: Int): Int {
    if (stairsCount == 0 || stairsCount == 1) {
        return 1
    }

    var a = 1
    var b = 1

    for (i in 2..stairsCount) {
        val temp = a + b
        a = b
        b = temp
    }

    return b
}

fun addBinary(a: String, b: String): String {
    var carry = 0
    var i = a.length - 1
    var j = b.length - 1
    val result = StringBuilder()

    while (i >= 0 || j >= 0 || carry != 0) {
        val sum = carry + (if (i >= 0) a[i--] - '0' else 0) + (if (j >= 0) b[j--] - '0' else 0)
        result.append(sum % 2)
        carry = sum / 2
    }

    return result.reverse().toString()
}


