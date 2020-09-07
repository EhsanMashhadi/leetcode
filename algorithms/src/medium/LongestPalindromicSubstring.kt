package medium

fun main() {
    val longestPalindromicSubstring = LongestPalindromicSubstring()
    val result = longestPalindromicSubstring.run("abcddddd")
    println(result)
}

class LongestPalindromicSubstring {

    fun run(s: String): String {
        var longestString = ""
        for (i in 0..s.length)
            for (j in i..s.length) {
                if (j - i > longestString.length) {
                    val substring = s.substring(i, j)
                    if (substring.length > longestString.length && substring == substring.reversed())
                        longestString = substring
                }
            }
        return longestString
    }
}