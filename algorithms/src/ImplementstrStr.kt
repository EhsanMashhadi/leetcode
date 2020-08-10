fun main() {
    val implementstrStr = ImplementstrStr()
    val result = implementstrStr.run("abbabbc", "c")
    println(result)
}

class ImplementstrStr {

    fun run(haystack: String, needle: String): Int {
        if (needle.isEmpty())
            return 0
        if (needle.length > haystack.length) {
            return -1
        }
        var result = -1
        var index: Int

        for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                result = i
                index = i
                for (j in needle) {
                    if (haystack.length < index + 1) {
                        return -1
                    }
                    if (j != haystack[index]) {
                        result = -1
                        break
                    }
                    index++
                }
            }
            if (result >= 0) {
                return result
            }
        }
        return result
    }
}