fun main() {
    val input = arrayOf("dog", "racecar", "car")
    val longestCommonPrefix = LongestCommonPrefix()
    val result = longestCommonPrefix.run(input)
    println(result)
}

class LongestCommonPrefix {

    fun run(strs: Array<String>): String {
        var result = ""
        var temp: String
        var contain = true
        if (strs.isNotEmpty())
            for (i in strs[0].indices) {
                temp = strs[0][i].toString()
                for (j in strs.indices) {
                    if (strs[j].length <= i) {
                        return result
                    } else if (temp != strs[j][i].toString()) {
                        contain = false
                    }
                }
                if (contain) {
                    result += temp
                }
            }
        return result
    }
}