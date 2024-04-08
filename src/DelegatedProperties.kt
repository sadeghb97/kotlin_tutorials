import kotlin.reflect.KProperty

class Product (var name : String, var dollarPrice : Double){
    var tomanPrice : Double by Market()

    fun print(){
        println("$name -> ${dollarPrice}\$ -> ${tomanPrice}T")
    }
}

class Market {
    val dollarValue : Double = 50000.0

    operator fun getValue(thisRef: Product?, property: KProperty<*>): Double {
        return (thisRef?.dollarPrice ?: 0.0) * dollarValue
    }

    operator fun setValue(thisRef: Product?, property: KProperty<*>, value: Double) {}
}

fun main(args: Array<String>){
    var product : Product = Product("Cheese", 1.5)
    product.print()
    product.tomanPrice = 45000.0
    product.print()
}