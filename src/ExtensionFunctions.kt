//ba estefade az in ghabeliat mitavan be yek class hata agar
//open nabashad yek function ezafe kard
//yek tabe ra mitavan be companion objecte yek class ya yek object ham ezafe kard
//clas haye farzand extension function haye clase pedar ra be ers mibarand
//albate agar bekhahim mitavanim baraye clase farzand an ra mojadadan tarif konim

class AA;

open class BB;
class BBChild : BB();

fun AA.extFunc() = println("AA Extension Function Fired!");

fun BB.extFuncion() = println("BB fired its Extension Function");
fun BB.altExtFuncion() = println("BB fired its Alternative Extension Function");

fun BBChild.altExtFuncion() = println("BBChild fired its Special Alternative Extension Function");

fun main(args: Array<String>){
    var a:AA = AA();
    var b:BB = BB();
    var bChild:BBChild = BBChild();
    a.extFunc();
    b.extFuncion();
    b.altExtFuncion();
    bChild.extFuncion();
    bChild.altExtFuncion();
}

