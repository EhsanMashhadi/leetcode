package easy

fun main() {
    val reverseString = ReverseString()
//    val input = charArrayOf('A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a')
    val input = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString.run(input)
    for (char in input)
        println(char)
}

class ReverseString {

    fun run(s: CharArray): Unit {
        for (i in 0..(s.size / 2) - 1) {
            val temp = s[s.size - i - 1]
            s[s.size - i - 1] = s[i]
            s[i] = temp
        }
    }
}