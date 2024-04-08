
fun main (args: Array<String>){
    //size in araye ha sabet ast va taghir nakhahad kard
    //method add ya remove baraye ezafe va kam kardan nadarand
    val array:IntArray = intArrayOf(5, 10, 15, 20);
    val array2:IntArray = intArrayOf(50, 100, 150, 200, 300);
    val array3:CharArray = charArrayOf('a', 's', 'd', 'f');
    val array4:Array<Any> = arrayOf("Hi", true, 10, 'B', "Bye", 10.5f);

    array.set(1, 11);
    array[2] = 16;
    println("array[1]: " + array.get(1));
    println("array[2]: " + array[2]);

    val mrgArray:IntArray = array + array2;
    println("mrgArray[2]: " + mrgArray[2]);
    println("mrgArray[7]: " + mrgArray[7]);

    println("array3[1]: " + array3[1]);
    println("array4-Size: " + array4.size);

    val array5 = IntArray(5);
    array5[0] = 16;
    array5[2] = 19;
    println("array5-Size: " + array5.size);
    println("array5[0]: " + array5[0]);
    println("array5[2]: " + array5[2]);

    //by default in meghdar sefr ast.
    println("array5[1]: " + array5[1]);

    //This is wrong
    //val lastArray:Array<Int> = intArrayOf(14, 16);

    val lastArray:Array<Int> = arrayOf(14, 16);
    println("lastArray-Size: " + lastArray.size);
    println("lastArray[0]: " + lastArray[0]);
    println("lastArray is empty: " + lastArray.isEmpty());
    println("lastArray is not empty: " + lastArray.isNotEmpty());

    //These are wrong
    //println("array is Array of Int: " + array.isArrayOf<Int>());
    //println("array is Array of Char: " + array.isArrayOf<Char>());

    println("lastArray is Array of Int: " + lastArray.isArrayOf<Int>());
    println("lastArray is Array of Char: " + lastArray.isArrayOf<Char>());

    println("LastArray: " + lastArray);
    println("LastArrayToList: " + lastArray.toList());

    val anotherArray:Array<Any> = arrayOf(5, 10, 15, 20);
    anotherArray.set(1, "ddddddddddddddd");

    val anotherArray2:Array<Any> = arrayOf(5, 10, 15, 20);
    //This is wrong
    //anotherArray2.set(1, "ddddddddddddddd");

    //create a fixed size IntArray and initializing the array later
    val fixedArray = IntArray(10);
    fixedArray[2] = 16;
    println("FixedArray[2]: " + fixedArray[2])

    val fixedArray2 = Array<Any>(15, {it});
    println("FixedArray2[6]: " + fixedArray2[6])
    println("FixedArray2[12]: " + fixedArray2[12])
    println("---------------")

    var s:Array<Int> = (1..5).toList().toTypedArray()
}