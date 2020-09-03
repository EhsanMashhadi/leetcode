package easy

fun main() {
    val palindromeLinkedList = PalindromeLinkedList()
    val node = PalindromeLinkedList.ListNode(-129)
    node.next = PalindromeLinkedList.ListNode(0)
    val result = palindromeLinkedList.run(node)
    println(result)
}

class PalindromeLinkedList {

    fun run(head: ListNode?): Boolean {
        var node = head
        val list = ArrayList<Int>()
        if (head == null) return true
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        for (i in 0..(list.size - 1) / 2) {
            if (list[i] != list[list.size - 1 - i])
                return false
        }
        return true
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}