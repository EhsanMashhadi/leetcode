fun main() {
    val validPalindrome = ValidPalindrome()
    val result = validPalindrome.run(".")
    println(result)

}

class ValidPalindrome {

    fun run(s: String): Boolean {
        if (s.trim().isEmpty())
            return true
        val alphanumeric = s.replace("[^A-Za-z0-9 ]".toRegex(), "")
            .toLowerCase().replace("\\s".toRegex(), "")
        if(alphanumeric.isEmpty())
            return true
        for (i in 0..alphanumeric.length / 2) {
            val start = alphanumeric[i].toString()
            val end = alphanumeric[alphanumeric.length - 1 - i].toString()
            if (start != end)
                return false
        }
        return true
    }
}