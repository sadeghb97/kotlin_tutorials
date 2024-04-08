package mypackage

class Person (var name:String, var age:Int){
    var city:String = ""

    constructor(name:String, age:Int, city:String) : this(name, age) {
        this.city = city
    }
}

fun main(args: Array<String>){
    val p:Person = Person("Reza", 30, "Tehran")
    println("Name: " + p.name)
    println("Age: " + p.age)
    println("Age: " + p.city)
}