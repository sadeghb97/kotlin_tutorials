class DoubleVar (val value: Double){
    infix fun zarbdar(d: DoubleVar) : DoubleVar {
        return DoubleVar(this.value * d.value)
    }
}

fun main(args: Array<String>){
    var d: DoubleVar = DoubleVar(2.5)
    var d2: DoubleVar = DoubleVar(4.0)
    var res: DoubleVar = d zarbdar  d2
    println(res.value)
}