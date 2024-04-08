import java.util.*
import kotlin.collections.ArrayList

fun main (args: Array<String>){
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()

    val scannerHandler = ScannerHandler()
    scannerHandler.nextLineSerie()

    var oneCount = 0
    var twoCount = 0

    scannerHandler.list.forEach {
        if(it == "1") oneCount++
        else if(it == "2") twoCount++
    }

    var flag = if((twoCount % 2) == 1) 2 else 0
    if(flag == 2){
        if(oneCount == 0) println(2)
        else if((oneCount % 2) == 0) println(0)
        else println(1)
    }
    else {
        if(oneCount == 0) println(0)
        else if((oneCount % 2) == 0) println(0)
        else println(1)
    }
}

class ScannerHandler() {
    public var list: ArrayList<String> = ArrayList()
    private val scanner: Scanner = Scanner(System.`in`)

    fun nextLineSerie() {
        val str = scanner.nextLine()
        val pieces = str.split(" ".toRegex()).toTypedArray()
        list = arrayListOf(*pieces)
    }

    fun atInt(index: Int): Int {
        return list[index].toInt()
    }

    fun atDouble(index: Int): Double {
        return list[index].toDouble()
    }

    fun atString(index: Int): String {
        return list[index]
    }

    fun nextLine(): String {
        return scanner.nextLine()
    }
}