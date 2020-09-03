package easy

fun main() {
    val pascalsTriangle = PascalsTriangle()
    val result = pascalsTriangle.run(5)
    for (value in result) {
        println(value)
    }
}

class PascalsTriangle {

    fun run(numRows: Int): List<List<Int>> {
        val list = ArrayList<ArrayList<Int>>()
        for (i in 0 until numRows) {
            list.add(i, ArrayList())
            for (j in 0..i) {
                if (j == 0 || j == i) {
                    list[i].add(j, 1)
                } else {
                    list[i].add(j, list[i - 1][j - 1] + list[i - 1][j])
                }
            }
        }
        return list
    }
}