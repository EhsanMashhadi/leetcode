package easy

fun main() {
    val firstUniqueCharacterInAString = FirstUniqueCharacterInAString()
    val result = firstUniqueCharacterInAString.run("dddccdbba")
    println(result)
}

class FirstUniqueCharacterInAString {

    fun run(s: String): Int {
        if (s.length == 1)
            return 0
        for (i in 0..s.length - 1) {
            if (!s.substring(i + 1).contains(s[i].toString()) &&
                !s.substring(0, i).contains(s[i].toString())
            )
                return i
        }
        return -1
    }
}