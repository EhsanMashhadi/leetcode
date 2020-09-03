package easy

import java.util.*

fun main() {
    val minStack = MinStack1()
    minStack.push(3)
    minStack.push(2)
    minStack.push(1)
    minStack.push(4)
    minStack.push(0)

    println(minStack.top())
    println(minStack.pop())
    println(minStack.getMin())
}

class MinStack() {

    /** initialize your data structure here. */
    private val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.addFirst(x)
    }

    fun pop() {
        queue.removeFirst()
    }

    fun top(): Int {
        return queue.first
    }

    fun getMin(): Int {
        return queue.min()!!
    }
}

class MinStack1() {

    /** initialize your data structure here. */
    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x)
    }

    fun pop() {
        if (minStack.peek() == stack.pop())
            minStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}