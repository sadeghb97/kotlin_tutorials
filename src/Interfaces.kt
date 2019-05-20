//property haye interface nemitavanand meghdare avalie dashte bashand
//method haye interface mitavanand badane default dashte bashand
//clasi ke mikhahad yek interface ra implement konad bayad property ha
//va method haei ke badane nadarad ra override konad
//yek class hade aksar mitavanad az yek class ersbari konad ama
//mitavanad chandin interface ra implement konad

//interface ha nemitavanand constructor dashte bashand pas
//nemitavan be an ha chizi pas dad va dar natije joloye esme
//interface hichvaght perantez nemigozarim

//dar tarife interface ha az keyworde abstract estefade nemishavad

interface Printablee {
    var p:Int

    fun print() = println("Printing a printable object!")
    fun print2()
}

interface Readablee {
    fun read()
}

open class A

class Book(override var p: Int) : A(), Printablee, Readablee{
    override fun read() = println("Reading Book Started! - $p")
    override fun print2() = println("Alternative Printing Book Started! - $p")
}

fun main (args: Array<String>){
    val book:Book = Book(144444)
    book.print()
    book.print2()
    book.read()

    var readable:Readablee = object : Readablee {
        override fun read() = println("Readable Anonymous Implementation!")
    }
    readable.read()

    var printable:Printablee = object : Printablee {
        override var p:Int = 20

        override fun print2() = println("Printable Print2 Anonymous Implementation!")

    }
    printable.print2()
}