import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IndexOutOfBoundsException

//mesle if va when dar try catch ham mitavanim az halate expressioni estefade konim
//be jaye halate statementi ke dar an meghdar return khahad shod
//blocke finaly akhare try catch anjam mishavad che dochar exception shavim
//che nashavim

fun main(args:Array<String>){
    var list:ArrayList<Int> = arrayListOf(14, 24, 34, 44);

    try{
        println("Value: " + list[3] / 1);
    }
    catch (ex:ArithmeticException){
        println("ArithmeticException");
    }
    catch (ex:IndexOutOfBoundsException){
        println("IndexOutOfBoundsException");
    }
    catch (ex:Exception){
        println("Exception");
    }
    finally {
        println("Finaly Finished!");
    }

    val result:Int?;
    result = try{10/0} catch (ex:Exception){null};
    println("Result: " + result);
}