
fun main(args : Array<String>) {
    var str:String?;
    str = null;
    println(str?.length);
    str = "Sadegh Bagherzadeh!";
    println(str?.length);

    //Im sure str is not null
    //if str is null exception will be thrown
    println(str!!.length);
}