package Intro

fun main() {
    print("Search Results :  ${pseudoBinaryContains(56, listOf(4, 62, 3, 7, 4, 7, 9056, 56, 563, 545, 70, 45, 6750, 51, 42, 78))}")
}
//Time Complexity Sample
//1.logarithmic time
fun pseudoBinaryContains(value: Int, data: List<Int>): Boolean {
    val midNum = data.run {
        this.sorted()
        this.size / 2
    }
    if (value <= data[midNum]) {
        for (num in 0..midNum) {
            if (data[num] == value) {
                return true
            }
        }
    } else {
        for (num in midNum until data.size) {
            if (data[num] == value) {
                return true
            }
        }
    }
    return false
}

