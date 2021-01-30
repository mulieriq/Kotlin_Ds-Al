package ElementaryDS.LinkedLIst

fun main() {
    println("Creating and linking nodes")
    runNodes()
}

fun runLinkedList() {
    var list = LinkedList<Int>()
}

fun runNodes() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1)
}
