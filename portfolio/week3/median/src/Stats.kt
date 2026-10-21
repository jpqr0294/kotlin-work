// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    if (list.size == 0) {
        throw IllegalArgumentException("Not enough data")
    }

    val sortedList = list.sorted()
    var med = 0.0f
    
    if (sortedList.size % 2 == 1) {
        med = sortedList[sortedList.size / 2]
    }
    else if(sortedList.size % 2 == 0) {
        val upper = sortedList[sortedList.size / 2]
        val lower = sortedList[(sortedList.size - 1) / 2]
        med = (upper + lower) / 2
    }

    return(med)
}