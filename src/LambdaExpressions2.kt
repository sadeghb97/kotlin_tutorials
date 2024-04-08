//functional interface ha interface haei hastand ke faghat yek
//method darand ke bayad piade sazi shavad

//be funcione fireLambda dar file LambdaExpression deghat konid
//vaghti dar kotlin mikhahim yek function java ra seda bezanim ke yek functional
//interface migirad yek piade sazi dar kotlin be in function javaei khodkar afzude mishavad,
//dorost manande functione mesale ghabl ke be jaye inke shey az an interface begirad
//be jayash yek lambda ba type hamahang ba methode functional interface migirad
//va masalan agar gharar bashad shey az functional interface jaei set shavad
//in lambda darune methode yek sheye jadide sakhte shode az an functional interface
//seda zade shode va sepas an shey set mishavad

//albate ghazie bala baraye class haye kotlini set nemikonad

import mypackage.View;

fun main(args: Array<String>){
    var view:View = View();
    view.setOnClickListener { println("View OnClick!!!") }

    var runnable:Runnable = Runnable { println("Runnable fired") };
    runnable.run();

    var list:ArrayList<Int> = arrayListOf(8, 16, 24, 32, 40, 48, 54);
    list.forEach { value:Int -> println(value) }
    list.forEachIndexed { index:Int, value:Int -> println("$index: $value") }

    println("FilterList!");
    list.stream().filter{value:Int -> value >= 20}.forEach{value:Int -> println(value)}
}