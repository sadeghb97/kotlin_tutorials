//data class ha tafavot ha va vijhegi haei afzun, nesbat be clase mamuli darand
//data class ha finaland va nemitavanand ba keyworde open ya abstract tarif shavand

class Guy(var name:String, var age:Int)
data class DataGuy (var name:String, var age:Int)

fun main (args: Array<String>){
    var guy:Guy = Guy("Sadegh", 23);
    var guy2:Guy = Guy("Sadegh", 23);

    var dataGuy:DataGuy = DataGuy("Sadegh", 23);
    var dataGuy2:DataGuy = DataGuy("Sadegh", 23);

    //adrese khane hafeze chap mishavad
    println("guy: " + guy);

    //name class va sakhtar va maghadire an chap mishavad
    println("dataGuy: " + dataGuy);

    //adrese hafeze ba ham chek mishavad va natije false khahad bud
    println("guy == guy2: " + guy.equals(guy2));

    //maghadire property ha ba ham chek mishavad va natije true khahad bud
    println("dataGuy == dataGuy2: " + dataGuy.equals(dataGuy2));

    //dar data class ha ba estefade az methode copy mitavanim
    //yek sheye copy ba maghadire yeksan besazim
    var dataGuy3:DataGuy = dataGuy.copy();
    println("dataGuy3: " + dataGuy3);

    //mitavanim hengame copy yek meghdar ra estesna konim
    var dataGuy4:DataGuy = dataGuy.copy(age = 26);
    println("dataGuy4: " + dataGuy4);

    //be in surat ham mitavanim maghadire data class ra darun moteghayyer ha berizim
    var (x, y) = dataGuy;
    println("X: $x");
    println("Y: $y");
}