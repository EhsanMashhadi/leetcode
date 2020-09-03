package easy

fun main() {
    val romanToInteger = RomanToInteger()
    val result = romanToInteger.run("MCDLXXVI")
    println(result)
}

class RomanToInteger {

    fun run(s: String): Int {
        val map = HashMap<String, Int>()
        map["I"] = 1
        map["V"] = 5
        map["X"] = 10
        map["L"] = 50
        map["C"] = 100
        map["D"] = 500
        map["M"] = 1000

        val map1 = HashMap<String, Int>()
        map1["IV"] = 4
        map1["IX"] = 9
        map1["XL"] = 40
        map1["XC"] = 90
        map1["CD"] = 400
        map1["CM"] = 900

        var result = 0
        var i = 0
        loop@ while (i < s.length) {
            when (s[i].toString()) {
                "I", "X", "C" -> {
                    if (s.length > i + 1 && map1.containsKey(s.substring(i, i + 2))) {
                        result += map1[s.substring(i, i + 2)]!!
                        i += 2
                    } else {
                        result += map[s[i].toString()]!!
                        i++
                    }
                }
                else -> {
                    result += map[s[i].toString()]!!
                    i++
                }
            }
        }
        return result
    }
}