fun main() {
    val linkedListCycle = LinkedListCycle()
    val node = LinkedListCycle.ListNode(1)
    node.next = LinkedListCycle.ListNode(2)
    node.next!!.next = node
    val result = linkedListCycle.run1(node)
    println(result)
}

class LinkedListCycle {
    fun run(head: ListNode?): Boolean {
        val map = HashSet<ListNode>()
        var temp = head
        while (temp != null) {
            if (!map.add(temp)) return true
            temp = temp.next
        }
        return false
    }

    fun run1(head: ListNode?): Boolean {
        if (head?.next == null) return false
        var slow = head.next
        var fast = head.next!!.next
        while (slow != fast) {
            if (fast?.next == null) return false
            slow = slow!!.next
            fast = fast.next!!.next
        }
        return true
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}