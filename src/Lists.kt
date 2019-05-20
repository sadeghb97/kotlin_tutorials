import java.util.*
import kotlin.collections.ArrayList

fun main (args: Array<String>){
    //in list ha readonly hastand va ghabele taghir nadarand
    //na mitavan indexi ra taghir dad va na size an ra taghir dad
    var list = listOf(5, "dddd");
    var list2:List<Any> = listOf(5, "dddd");
    println("list: " + list);
    println("list[1]: " + list[1]);

    var arrayList = arrayListOf(10, 15, 18, 24);
    //This is wrong
    //arrayList.add("dddddddddddd");

    var arrayList2:ArrayList<Any> = arrayListOf(10);
    //This is OK
    arrayList2.add("ddddddddddddd");

    var arrayList3 = arrayListOf(10, "ddddddddddddddd");
    //This is OK
    arrayList3.add("ddddddddddddd");

    println("arrayList: " + arrayList);
    println("arrayList2: " + arrayList2);
    println("arrayList3: " + arrayList3);

    //size taghir nemikonad
    arrayList.set(1, 25);

    //size taghir mikonad
    arrayList.add(2, 1000);

    println("arrayList: " + arrayList);

    var removed:Any = arrayList.remove(1);
    //remove return a boolean
    println("Removed: " + removed);

    removed = arrayList.remove(18);
    //remove return a boolean
    println("Removed: " + removed);

    removed = arrayList.removeAt(1);
    //removeAt return an element
    println("Removed: " + removed);

    println("arrayList: " + arrayList);

    arrayList.add(2, 999);
    arrayList.add(2, 998);
    arrayList.add(2, 997);
    println("arrayList: " + arrayList);

    var sublist:MutableList<Int> = arrayList.subList(1, 5);
    println("SubList" + sublist);

    //arraylist yek piadesazi az interface mutable list ast;
    //funcione subList yek mutable list bar migardanad va nemitavan
    //an ra dar var az noe arraylist rikht
    //albate dar kotlin interface ha bar khalafe java
    //mitavanand badane dashte bashand pas agar bekhahim az an ha estefade konim
    //niazi nist hatman an hara implement konim

    //This is Wrong
    //var sublist2:ArrayList<Int> = arrayList.subList(1, 5);


    //nahve sakhte yek object az class mesle javast vali niazi be keyworde
    //new nadarad

    //This is Wrong
    //var emptyArrayList = new ArrayList<Int>();

    var emptyArrayList = ArrayList<Int>();
    println("emptyArrayList: " + emptyArrayList);
}