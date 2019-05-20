//ham tabe ha va ham class ha mitavanand generic bashand
//bishtare karbordeshan ehtemalan dar kar ba list hast

class GenericClass<T, V> (var x:T, var y:V);

fun main(args: Array<String>){
    var gc:GenericClass<String, String> = GenericClass("sssscswef", "dddddfrvr");
    println("GCX: " + gc.x.substring(0, 5));
    println("GCY: " + gc.y.substring(0, 5));

    var gc2:GenericClass<Int, String> = GenericClass(14, "dddddfrvr");
    println("GC2X: " + (gc2.x + 100));
    println("GC2Y: " + gc2.y.substring(0, 5));

    printArgs(14, 25, 36, 48);
    printArgs("sss", "rrrr", "dfvd", "pkoio");
}

fun <T> printArgs(vararg args:T){
    args.forEachIndexed{index,value -> println("$index: $value")}
}