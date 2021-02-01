package ElementaryDS.LinkedLIst

fun main() {
    println("Creating and linking nodes")
    // runNodes()
    runLinkedList()
}

fun runLinkedList() {
    val list = LinkedList<Int>()
//    list.run {
////      it.push(1)
////      it.push(2)
////      it.push(3)
////      it.append(0)
////      it.push(5)
//        this.push(3)
//        this.push(2)
//        this.push(1)
//
//    }
    list.push(3)
    list.push(2)
    list.push(1)
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
