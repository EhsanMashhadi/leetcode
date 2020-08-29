import java.util.*

fun main() {
    val reverseLinkedList = ReverseLinkedList()
    val node = ReverseLinkedList.ListNode(1)
    node.next = ReverseLinkedList.ListNode(2)
    node.next!!.next = ReverseLinkedList.ListNode(3)

    var result = reverseLinkedList.run(node)
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

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

