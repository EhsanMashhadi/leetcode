fun main() {
    val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
    val string = "Hi this is a test messag abcdefgh"
    val result = longestSubstringWithoutRepeatingCharacters.run(string)
    println(result)
}

class LongestSubstringWithoutRepeatingCharacters {

    fun run(s: String): Int {
        var maxNumber = 1
        var number = 1
        var posFrom = 0
        var posTo = 1
        var charChecker = 1

        while (true) {
            if (s.isEmpty()) {
                maxNumber = 0
                break
            }
            if (posTo == s.length) {
                break
            }
            val sub = s.substring(posFrom, posTo)
            val char = s[charChecker]
            if (sub.contains(char)) {
                posFrom++
                posTo = posFrom + 1
                charChecker = posTo
                number = 1
            } else {
                number++
                charChecker++
                posTo++
                if (number > maxNumber) {
                    maxNumber = number
                }
            }
        }
        return maxNumber
    }
}