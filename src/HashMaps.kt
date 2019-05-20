fun main (args: Array<String>){
    //How to get type of a variable
    var str:String = "";
    println(str::class.qualifiedName);

    var map:HashMap<Int, String> = hashMapOf(1 to "one", 10 to "Ten");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four");
    println(map);

    map.set(2, "Twooooooooo");

    //this return false
    map.remove(10, "Tennnnn");

    //this return true and remove element
    map.remove(10, "Ten");

    map.remove(4);
    println(map);

    //this return null
    println(map.get(0));

    println(map.get(1));
    println(map[2]);

    var list:List<Pair<Int, String>> = map.toList();
    println(list);
    println(list.get(0));

    println(list::class.simpleName);
    println(list.get(1)::class.simpleName);

    var pair:Pair<Int, String> = 10 to "TEEEEEEENNNNNNNNNN";
    println(pair);
}