//clase abstract open ham hast
//az clase abstract nemitavan shey sakht
//agar clasi methode abstract dashte bashad khode clas ham bayad ba keyworde
//abstract tarif shavad
//property ha ham mitavanand abstract bashand
//har property ya bayad meghdar dehi shavad (pishfarz ya dar init)
//ya inke abstract bashad
abstract class User(var name:String, var age:Int){
    abstract var x:Int;
    fun login() = println("$name login shod!");
    abstract fun sayHello();
}

class NormalUser(name:String, age:Int, var code:Int, override var x: Int):User(name, age){
    override fun sayHello() = println("Hello from a Normal user");
}

class AdminUser(name:String, age:Int, var code:Int):User(name, age){
    override var x:Int = 16;
    override fun sayHello() = println("Hello from a Admin user");
}

fun main(args: Array<String>){
    var nuser:NormalUser = NormalUser("Hamid", 21, 444444, 28);
    nuser.sayHello();

    var auser:AdminUser = AdminUser("Mehrdad", 25, 785454);
    auser.sayHello();
}