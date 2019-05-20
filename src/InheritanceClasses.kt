
//be tore pishfarz class ha finaland va ghabele ers bari nistand
//baraye inke class ghabele ers bari shavad bayad keyworde open ra be an ezafe kard
//motheghayyer ha va method ha ham pishfarz ghabele override kardan nistand
//baraye an ha ham mitavan az keyworde open estefade kard

open class MyPerson(var name:String, var age:Int){
    init {
        println("MyPerson Created!");
    }

    open fun sayHello() = println("Hello From $name");
}

//aval constructore pedar va sepas constructore farzand seda zade mishavad
class MyStudent(name:String, age:Int, var code:Int):MyPerson(name, age){
    init {
        println("MyStudent Created!");
    }

    //method override shode be surate pishfarz final nist
    //pas agar clasi az MyStudent ersbari konad method override shode zir ra
    //mojadadan mitavanad override konad
    //agar bekhahim joloye in kar ra begirim mitavanim az keyworde final
    //estefade konim
    override final fun sayHello(){
        //baraye estefade az property va method haye clase pedar az super estefade mikonim
        super.sayHello();
        println("Hello From $name A good Student")
    }
}

fun main (args: Array<String>){
    var mp:MyPerson = MyPerson("Hamid", 17);
    mp.sayHello();
    var ms:MyStudent = MyStudent("Sadegh", 19, 145236);
    ms.sayHello();
}