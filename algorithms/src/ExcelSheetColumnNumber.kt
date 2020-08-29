fun main() {
    val excelSheetColumnNumber = ExcelSheetColumnNumber()
    val result = excelSheetColumnNumber.run("ZY")
    println(result)
}

class ExcelSheetColumnNumber {

    fun run(s: String): Int {
        var result = 0
        for (char in s) {
            result = result * 26 + (char - 'A' + 1)
        }
        return result
    }
}