//bejaye final static dar kotlin const val ra darim
//const val marbut be dade haye sabeti hastand ke dar yek object ya companion object
//tarif mishavand
//const ra nemitavan ba var tarif kard
//const ra ba val kharej az object nemitavan tarif kard

object MyObject{
    //in doroste
    val name:String = giveMeAName();

    //in dorost nist. const val ra bayad sarihan meghdar bedahim
    //const val name:String = giveMeAName();

    //in doroste
    const val anotherName:String = "Abbas";
}

fun main(args: Array<String>){
    println("name: " + MyObject.name);
    println("anotherName: " + MyObject.anotherName);
}

fun giveMeAName() = "AliReza";