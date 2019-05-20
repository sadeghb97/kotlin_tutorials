//bahse setter va getter dar kotlin ba java motefavet ast
//ma digar chenin kari nemikonim ke masalan property ra private begozarim
//va sepas yek gettere public baraye an benevisim (albate dar kotlin ham
//ham chenan mitavanim chenin chizi ra piade konim)

//har property be tore pishfarz yek setter va yek getter darad
//in setter va gettere pishfarz ra mitavan taghir dad
//vaghti harjaei minevisim masalan follower.name = "dd" settere property ejra mishavad
//vaghti harjaei minevisim follower.name gettere property ejra mishavad
//manzur az har jaei che darune khode class va che birune an ast

//sathe dastresie setter va getter dar in halat nemitavanad motefavat az
//khode property bashad

class Follower(){
    var name:String = "Hamed"
        get(){
            return field + "###";

            //injuriam mishe
            //return name + "###;
        }

        //inja injuriam mishe
        //get() = field + "###";

        set(value){
            field = value.substring(0, 6);
        }

    fun sayHello() = println("Hello My Name Is $name");
}

fun main(args: Array<String>){
    var follower:Follower = Follower();
    follower.sayHello();
    follower.name = "HamidReza";
    follower.sayHello();
    println(follower.name);

}