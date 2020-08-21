fun main() {
    val fizzBuzz = FizzBuzz()
    val result = fizzBuzz.run(15)
    for (str in result)
        println(str)
}

class FizzBuzz {

    fun run(n: Int): List<String> {
        val list = ArrayList<String>()
        for (i in 1..n) {
            when {
                i % 15 == 0 -> {
                    list.add("FizzBuzz")
                }
                i % 5 == 0 -> {
                    list.add("Buzz")
                }
                i % 3 == 0 -> {
                    list.add("Fizz")
                }
                else -> {
                    list.add(i.toString())
                }
            }
        }
        return list
    }
}