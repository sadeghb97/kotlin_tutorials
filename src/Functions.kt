import java.util.*

fun main (args: Array<String>){
    var scan:Scanner = Scanner(System.`in`);
    print("Please input a: ");
    var a:Int = scan.nextInt();
    print("Please input b: ");
    var b:Int = scan.nextInt();

    println("Max: ${getMax(a, b)}");
    hello(22, "Sadegh");
    hello(name="Vavid");
    hello(name="Navid", age=26);
    listHello(1000, 1001, 10002);
}

//dar ghesmate paramter haye function ha var ya val nemigozarim
//va pishfarz in vorudi ha manande val hastand
//agar bekhahim ke tabe betavanad null ham return konad
//type khoruji ra be jaye int, bayad int? bogozarim
fun getMax(a:Int, b:Int):Int {
    var max:Int;
    max = if(a>=b) a else b;
    return max;
}

//dar kotlin parameter ha mitavanand default value dashte bashand
//agar hengam seda zadan method value ra hamrah ba name arg befrestim
//niazi nist tartibe parameter hara raayat konim.
fun hello(age:Int=30, name:String){
    println("Name: $name --- Age: $age");
}

//agar ke bekhahim yek tedadi beine 0 ta har andaze ei az yek type
//ra be function befrestim az keyworde vararg ghable az name vorudi
//estefade mikonim. in vorudi mesle yek list mishavad
//mamulan in noe az vorudi ya tanha vorudi tabe ya akharin vorudi tabe ast
fun listHello(vararg items:Int){
    for(item:Int in items){
        println("Item: $item");
    }
}