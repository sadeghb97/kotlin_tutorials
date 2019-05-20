import java.util.*

fun main(args : Array<String>){
    val scan = Scanner(System.`in`);
    var num:Int;

    print("Please Enter Number: ");
    num = scan.nextInt();

    if(num % 2 == 0) println("Adad zoj ast");
    else println("Adad fard ast");

    num = scan.nextInt();

    when (num){
        1 -> println("Shanbe");
        2 -> println("YekShanbe");
        3 -> println("DoShanbe");
        4 -> println("SeShanbe");
        5 -> println("CharShanbe");
        6 -> println("PanjShanbe");
        7 -> {
            println("Jome");
            println("Tatile :)");
        };
        !in 8..20 -> println("Eshtebah ast! beine 8 ta 20 nist!");
        else -> println("Eshtebah ast! beine 8 ta 20 ast!");
    }

    num = scan.nextInt();
    var result:String;

    result = when (num){
        1 -> "Shanbe";
        2 -> "YekShanbe";
        3 -> "DoShanbe";
        4 -> "SeShanbe";
        5 -> "CharShanbe";
        6 -> "PanjShanbe";
        7 -> "Jome";
        !in 8..20 -> "Eshtebah ast! beine 8 ta 20 nist!";
        else -> "Eshtebah ast! beine 8 ta 20 ast!";
    }

    println("Result: " + result);
}