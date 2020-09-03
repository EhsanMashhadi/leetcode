package easy

import java.math.BigDecimal
import java.text.DecimalFormat

fun main() {
    val plusOne = PlusOne()
    val nums = intArrayOf(
        8, 9, 7, 9, 9
    )
    val result = plusOne.run1(nums)
    for (num in result) {
        println(num)
    }
}

class PlusOne {

    fun run(digits: IntArray): IntArray {

        var number: BigDecimal = BigDecimal.ZERO
        for (i in digits.indices) {
            number += BigDecimal.valueOf(10).pow((digits.size - i - 1)).multiply(digits[i].toBigDecimal())
        }
        number++
        val decimalFormat = DecimalFormat()
        decimalFormat.maximumFractionDigits = 2
        decimalFormat.minimumFractionDigits = 0
        decimalFormat.isGroupingUsed = false
        val numberString = decimalFormat.format(number)
        val result = IntArray(numberString.length)
        for (i in numberString.indices) {
            result[i] = number.toString()[i].toString().toInt()
        }
        return result
    }

    fun run1(digits: IntArray): IntArray {
        var next = false
        val arrayList = ArrayList<Int>()
        for (i in digits.size - 1 downTo 0) {
            val result = digits[i] + 1
            if (result == 10) {
                next = true
                digits[i] = 0
            } else {
                digits[i] = result
                next = false
            }
            if (!next) {
                break
            }
        }
        if (next) {
            arrayList.add(1)
        }
        arrayList.addAll(digits.toTypedArray())
        return arrayList.toIntArray()
    }
}