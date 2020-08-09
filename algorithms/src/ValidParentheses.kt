import java.util.*

fun main() {
    val validParentheses = ValidParentheses()
    val result = validParentheses.run("(){}[]{}")
    println(result)
}

class ValidParentheses {

    fun run(s: String): Boolean {
        val stack = Stack<String>()
        val map = mapOf("}" to "{", "]" to "[", ")" to "(")
        for (char in s)
            when (map.values.contains(char.toString())) {
                true -> {
                    stack.push(char.toString())
                }
                false -> {
                    if (stack.isNotEmpty() && stack.peek() == map[char.toString()])
                        stack.pop()
                    else
                        return false
                }
            }
        return stack.isEmpty()
    }
}