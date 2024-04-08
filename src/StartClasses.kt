
class Person(name:String, age:Int) {
    //var haye darun class bayad hatman meghdar avalie dashte bashand
    //ya dar constructor meghdar begirand ya abstract bashand
    //moteghayyere val yekbar mitavanad meghdar begirad
    //in yekbar mitavanad darun cinstructor va ba meghdare ersal shode bashad
    val name:String;
    var age:Int = 0;

    init {
        this.name = name;
        this.age = age;
        println("Person created ($name - $age)");
    }

    //agar tabe be surate yek khati bashad
    //mitavanad be in surat tarif shavad
    fun retName() = name;
}

//nam va code khodkar dar var haye class rikhte mishavad
class Student(var name:String, var code:Int);

//manande mesale bala var ha khodkar meghdar migirand va constructor
//badane ham darad
class Player(var name:String, var team:String){
    init{
        println("Player created ($name - $team)");
    }
}

fun main (args: Array<String>){
    var p:Person = Person("Sadegh", 16);
    var p2:Person = Person("Masud", 29);
    var student:Student = Student("Karimifar", 5940);
    println("Student: (${student.name} - ${student.code})");
    var player:Player = Player("WayneRooney", "MUFC");
    println(player.name + " (" + player.team + ")")
}