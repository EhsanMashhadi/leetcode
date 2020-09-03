package easy

fun main() {
    val mergeTwoSortedLists = MergeTwoSortedLists()
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(4)

    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next!!.next = ListNode(4)

    var result = mergeTwoSortedLists.run(list1, list2)

    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {

    fun run(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        var result = ListNode(-1)
        val ref = result

        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                result.next = ListNode(list1.`val`)
                list1 = list1.next
            } else {
                result.next = ListNode(list2.`val`)
                list2 = list2.next
            }
            result = result.next!!
        }

        if (list1 != null) {
            result.next = list1
        } else if (list2 != null) {
            result.next = list2
        }

        return ref.next
    }
}

