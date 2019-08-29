import java.util.Arrays
var arr = arrayOf(10,9,8,7,6,5,4,3,2,1)
fun bubbleSort(a: Array<Int>): Array<Int> {
    var swap = true
    while(swap) {
        swap = false
            for(i in 0 until arr.size-1){
                if (arr[i] > arr[i+1]){
                    var temp = arr[i]
                    var temp2 = arr[i+1]
                    arr[i] = temp2
                    arr[i+1] = temp
                    swap = true
            }
        }
    }
    return arr
}
fun main() {
    println(Arrays.toString(bubbleSort(arr)))
}