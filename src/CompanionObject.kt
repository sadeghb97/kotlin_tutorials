//ma dar kotlin kollan keyworde static ra nadarim
//agar niaz be yek clase tamam static dashte bashim mitavanim
//az singleton object estefade konim

//agar bekhahim dar yek class faghat chand ozve static dashte bashim
//che behtar ke hame an ha kenare ham bashand
//dar kotlin in model property ha va method ha ra darune blocke Companion Objecte
//class minevisim

class Pride {
    companion object {
        var number:Int = 0;
        val MAX_SPEED = 180;
    }

    init {
        println("Pride Created");
        number++;
    }
}

fun main(args: Array<String>){
    var pride:Pride = Pride();
    var pride2:Pride = Pride();
    var pride3:Pride = Pride();

    println("PrideClassNumber: " + Pride.Companion.number);
    println("PrideClassMaxSpeed: " + Pride.MAX_SPEED);
}
