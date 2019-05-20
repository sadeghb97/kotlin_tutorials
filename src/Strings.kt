fun main (args: Array<String>){
    var str:String = "Hello Everybody!";
    var str2:String = "                    Hello!    ";
    var age:Int = 26;

    println("Sene man $age sal ast!");
    println("${age}salegim");
    println("First: " + str.first());
    println("Last: " + str.last());
    println("Contains: " + str.contains("Eve"));
    println("Equals: " + str.equals("Hello Everybody!"));
    println("Index1: " + str.get(1));
    println("Index2: " + str[2]);
    println("StartsWith Hel: " + str.startsWith("Hel"));
    println("EndsWith !: " + str.endsWith("!"));
    println("IndexOf o: " + str.indexOf("o"));
    println("LastIndexOf o: " + str.lastIndexOf("o"));
    println("IndexOf Q: " + str.indexOf("Q"));

    println("replace o with e: " + str.replace("o", "e"));
    println("Reversed: " + str.reversed());

    println("STR2: " + str2 + " ---");
    println("TrimLeft: " + str2.trimStart() + " ---");
    println("TrimRight: " + str2.trimEnd() + " ---");
    println("Trim: " + str2.trim() + " ---");
}