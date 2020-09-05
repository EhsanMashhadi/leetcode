package medium

fun main() {
    val generateParentheses = GenerateParentheses()
    val result = generateParentheses.run(3)
    println(result)
}

class GenerateParentheses {

    fun run(n: Int): List<String> {
        val list = ArrayList<String>()
        if (n == 0) return list
        generate(list, "", n, n)
        return list
    }

    private fun generate(list: ArrayList<String>, str: String, left: Int, right: Int) {
        if (right == 0)
            list.add(str)
        if (left > 0)
            generate(list, "$str(", left - 1, right)
        if (right > left)
            generate(list, "$str)", left, right - 1)
    }
}