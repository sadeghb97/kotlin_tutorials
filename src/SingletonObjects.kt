//Singleton Object mesle clasist ke dar kole barname (hata ba chandin thread)
//faghat yek shey az an sakhte mishavad. constructore public nadarad va nemitavan be an
//vorudi dad
//vaghti baraye avalin bar az an estefade konim in shey khodkar sakhte mishavad
//va ta payane barname state an hefz khahad shod
//block init ham mitavan baraye an gozasht ke dar zamane sakhte shodan ejra mishavad

//shebahat haye ziadi ba clase static darad vali ba an tafavot darad
//nahve estefade az an manande clase static ast yani name singleton object ra minevisim
//va ba yek noghte be azaye an dastresi darim

//dar moghayese ba clase static behtar ast zamani ma az clase static estefade konim
//ke nakhahim state ra negah darim dar gheyre in surat estefade az singleton object
//behtar ast

//zemne inke clase singleton object ghabele ers barist vali az clase static
//nemitavan ersbari kard

object Utils {
    var calls:Int = 0;

    init{
        println("Utlis sakhte shod!");
    }
    fun hello(){
        println("Hello ${calls++}");
    }
}

fun main(args: Array<String>){
    Utils.hello();
    Utils.hello();
    Utils.hello();
}