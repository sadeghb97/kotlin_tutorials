class Utilities(printer: Printer, reader: Reader, writer: Writer) :
    Printer by printer, Reader by reader, Writer by writer

interface Printer {
    fun print(s: String)
}

interface Reader {
    fun read(s: String)
}

interface Writer {
    fun write(s: String)
}

fun main(args: Array<String>){
    val utilities: Utilities = Utilities(object : Printer{
        override fun print(s: String) {
            println("MyPrinter: $s")
        }
    }, object : Reader {
        override fun read(s: String) {
            println("MyReader: $s")
        }
    }, object : Writer{
        override fun write(s: String) {
            println("MyWriter: $s")
        }
    })

    val s:String = "Content"
    utilities.print(s)
    utilities.read(s)
    utilities.write(s)
}