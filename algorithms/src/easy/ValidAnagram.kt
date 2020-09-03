package easy

fun main() {
    val validAnagram = ValidAnagram()
    val result = validAnagram.run("", "")
    println(result)
}

class ValidAnagram {
    fun run(s: String, t: String): Boolean {
        val hashMap = HashMap<String, Int>()
        for (i in s)
            hashMap[i.toString()] = (hashMap[i.toString()] ?: 0) + 1
        for (j in t) {
            if (hashMap[j.toString()] == null)
                return false
            hashMap[j.toString()] = hashMap[j.toString()]!! - 1
        }
        return hashMap.values.all { it == 0 }
    }
}