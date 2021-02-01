package ElementaryDS.LinkedLIst

fun main() {
    println("Creating and linking nodes")
    // runNodes()
    runLinkedList()
}

fun runLinkedList() {
    val list = LinkedList<Int>()
    list.run {
        this.push(1)
        this.push(2)
        this.push(3)
        this.append(0)
        this.push(5)
        this.push(3)
        this.push(2)
        this.push(1)

    }

    println(list.toString())
    var middleNode = list.nodeAt(1)!!
    for (i in 1..3) {
        middleNode = list.insert(-1 * i, middleNode)

    }
    println("After insertion : $list")
}

fun runNodes() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1)
}
