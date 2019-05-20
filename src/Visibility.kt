//manande java va zaban haye digar ast va nokte be khosusi nadarad
//se sathe dastresi public, protected va private ra darim
//pishfarz method ha va property haye class public and
//darune class be tamae aza dastresi darim
//darune clase farzand be tamame azaye public va protected
//darune yek file digar be tamame azaye public faghat dastresi darim

open class Father(){
    public var name:String = "Sadegh";
    protected var email:String = "sadegh@gmail.com";
    private var age:Int = 26;
}

class Child():Father(){
    fun hello() = println("Hello From Child: $name - $email");
}

fun main(args: Array<String>){
    var child:Child = Child();
    child.hello();

    println("ChildName: " + child.name);
}