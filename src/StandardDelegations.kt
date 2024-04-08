import kotlin.properties.Delegates

class HeavyWorker {
    init {
        println("Heavy Work Started")
    }

    fun print(){
        println("Heavy Printer")
    }
}

class Worker {
    val w: HeavyWorker by lazy { HeavyWorker() }

    var salary: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("$property: $oldValue -> $newValue")
    }

    var age: Int by Delegates.vetoable(20) { property, oldValue, newValue ->
        newValue in 20..30
    }
}

fun main(args: Array<String>){
    var worker: Worker = Worker()
    var worker2: Worker = Worker()

    worker.w.print()
    worker.salary = 2000
    worker.age = 45
    println(worker.age)
    worker.age = 25
    println(worker.age)
    worker.salary = 5000
}