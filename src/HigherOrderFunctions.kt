
fun main(args: Array<String>){
    foo("Hello", ::buz)
    val lambda:(String) -> Unit = { println("Lambda: $it")}
    foo("Hi", lambda)
}

fun foo(m: String, bar: (String) -> Unit) {
    bar(m)
}

fun buz(m: String) {
    println("message: $m")
}

