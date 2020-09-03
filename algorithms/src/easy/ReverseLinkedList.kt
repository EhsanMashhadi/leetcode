package easy

import java.util.*

fun main() {
    val reverseLinkedList = ReverseLinkedList()
    val node = ReverseLinkedList.ListNode(1)
    node.next = ReverseLinkedList.ListNode(2)
    node.next!!.next = ReverseLinkedList.ListNode(3)

    var result = reverseLinkedList.run2(node)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class ReverseLinkedList {

    private val stack = Stack<Int>()

    fun run(head: ListNode?): ListNode? {
        var node = head
        while (node != null) {
            stack.push(node.`val`)
            node = node.next
        }
        var result: ListNode?
        var ref: ListNode? = null
        if (stack.isNotEmpty()) {
            result = ListNode(stack.pop())
            ref = result
            while (stack.isNotEmpty()) {
                result!!.next = ListNode(stack.pop())
                result = result.next!!
            }
        }
        return ref
    }

    fun run1(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val nextTemp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTemp
        }
        return prev
    }

    fun run2(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return head
        val node = run2(head.next)
        head.next!!.next = head
        head.next = null
        return node
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

