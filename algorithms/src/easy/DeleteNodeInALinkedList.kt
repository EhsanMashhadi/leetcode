package easy

fun main() {
    val deleteNodeInALinkedList = DeleteNodeInALinkedList()
    val node = DeleteNodeInALinkedList.ListNode(4)
    node.next = DeleteNodeInALinkedList.ListNode(5)
    node.next!!.next = DeleteNodeInALinkedList.ListNode(1)
    node.next!!.next!!.next = DeleteNodeInALinkedList.ListNode(9)

    deleteNodeInALinkedList.run(node.next)

    var result: DeleteNodeInALinkedList.ListNode? = node
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class DeleteNodeInALinkedList {
    fun run(node: ListNode?) {
        node!!.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}