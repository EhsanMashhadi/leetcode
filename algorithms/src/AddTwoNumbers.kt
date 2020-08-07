import java.text.DecimalFormat

fun main() {
    val addTwoNumbers = AddTwoNumbers()
    addTwoNumbers.run()
}

class AddTwoNumbers {

    fun run() {
        val l1 = ListNode(9)
        val l2 = ListNode(5)
        l2.next = ListNode(6)
        l2.next!!.next = ListNode(4)

        var result = addTwoNumbers(l1, l2)

        while (result != null) {
            println(result.`val`)
            result = result.next
        }
    }

    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var number1 = ""
        var number2 = ""

        var l1Temp = l1
        var l2Temp = l2

        while (l1Temp != null) {
            number1 = l1Temp.`val`.toString() + number1
            l1Temp = l1Temp.next
        }

        while (l2Temp != null) {
            number2 = l2Temp.`val`.toString() + number2
            l2Temp = l2Temp.next
        }

        val decimalFormat = DecimalFormat("#.##")
        val result = (number1.toFloat() + number2.toFloat())
        val string1 = decimalFormat.format(result).reversed()

        val returnValue = ListNode(string1.substring(0, 1).toInt())
        var cursor = returnValue

        for (char in string1.substring(1, string1.length)) {
            val temp = ListNode(char.toString().toInt())
            cursor.next = temp
            cursor = temp
        }

        return returnValue
    }

    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}