fun main(args: Array<String>){
    val a = {inp:Int, inp2:Int ->
        println("inp: $inp");
        println("inp2: $inp2");
    }

    //cahegune type ebarate lambda ra moshakhas konim
    //dar in surat niazi nist dar khode ebarate lambda type ra moshakhas konim
    //in nokte mohem ast ke dar tarife type lambda noe vorudi ha hame bayad
    //dar yek perantez bashand. ama dar khode badane lambda vorudi ha nabayad darune
    //perantez gharar girand!
    //dar type moshakhas shode mitavan yek tabe mamuli ra ham rikht
    val b:(Int,Int) -> Boolean = {inp, inp2 ->
        println("inp: $inp");
        println("inp2: $inp2");

        //darune lambda az return estefade nemikonim
        //yek expression dar line akhar hokme return ra darad
        inp >= inp2;
    }

    //mesali digar
    val c = {inp:Int -> inp + 20}

    //zamani ke vorudie lambda faghat yeki bashad
    //dar badane lambda mitavan samte chap -> ra nanevesht
    //va az keyworde it estefade kard
    val f:(Int) -> Unit = {println("FFFF: $it")}

    //moshakhas kardane type vaghti lambda chizi bar nemigardanad
    val d:(Int, Int) -> Unit = {inp, inp2 -> println(inp+inp2)}

    //agar lambda vorudi nadashte bashad
    val e = {println("Hello EEEE!")}

    a(24, 51);
    var res:Boolean = b(30, 12);
    println("Res: $res");
    println(c(20));
    d(14, 14);
    e();
    f(777777);

    altFireLambda(14, {println("Inam Bad nist!")});

    //agar akharin vorude method yek lambda function bashad
    //mitavan an ra extract kard va be jaye inke an ra darune perantez gozasht
    //an ra joloye perantez gharar dad
    altFireLambda(41){println("Vali in behtare!")};

    //tebghe ghaede bala lambda ra mitavanim birune perantez bogzarim
    fireLambda(){println("Wowww aliye!")};

    //chun perantez khali mishavad mitavanim perantez hara pak konim
    //pas yek tabe ra vaghti bedune perantez mitavan seda zad ke
    //faghat yek lambda be onvane vorudi begirad
    fireLambda{println("Wowww in dg akherateshe!")};
}

fun fireLambda(lambda:() -> Unit){
    print("FireLambda: ");
    lambda();
}

fun altFireLambda(code:Int, lambda:() -> Unit){
    print("AlternativeFireLambda($code): ");
    lambda();
}