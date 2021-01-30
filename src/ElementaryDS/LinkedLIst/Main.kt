package ElementaryDS.LinkedLIst

fun main() {
    println("Creating and linking nodes")
   // runNodes()
    runLinkedList()
}

fun runLinkedList() {
    val list = LinkedList<Int>()
    list.push(1)
    list.push(2)
    list.push(3)
    print(list)
}

fun runNodes() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1)
}
