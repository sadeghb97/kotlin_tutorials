import StylishPrinter
import Style

class RoadMap() {
    init {

    }

    fun title(str: String, level:Int){
        for(i:Int in 1..level) print("   ")
        StylishPrinter.print(str,
            if(level == 0) Style.BOLD_CYAN else Style.BOLD_YELLOW
        )
    }

    fun code(str: String){
        StylishPrinter.println(str, Style.GREEN)
    }

    fun output(str: String){
        StylishPrinter.println(str, Style.BG_WHITE + Style.BLACK)
    }

    fun titleLn(str: String, level:Int){
        if(level == 0) println()
        title(str, level)
        println()
    }

    fun print() {
        var num:Int = 1
        title("${num++}- Mutable and Immutable Variables", 0)
        println(" (const, val, var)")
        titleLn("${num++}- Variable declaration", 0)
        println("   Unlike many other programming languages, variables in Kotlin do not need to be declared with a specified type.")
        println("   However, it is possible to specify the type if you insist.")
        code("   var name: String = \"John\" ")
        println("   Agar type yek variable moshakhas nashavad hengame init type an khodkar taein mishavad.\n" +
                "   dar natije baz ham har meghdari dar an nemitavan rikht. agar mikhahid moteghayyeri dashte bashid\n" +
                "   ke har meghdari dar an betavan rikht bayad type an ra Any begozarid")

        titleLn("${num++}- Primitive Data Types", 0)
        println("   Boolean, " +
                "Byte, " +
                "Char, " +
                "Double, " +
                "Float, " +
                "Int, " +
                "Long, " +
                "Short")

        titleLn("${num++}- Non-Primitive Data Types", 0)
        println("   Any, " +
                "Arrays, " +
                "Class, " +
                "Enum, " +
                "List, " +
                "Map, " +
                "Nothing, " +
                "Set, " +
                "String, " +
                "Unit")
        println("   Arrays: An Array is a data structure that stores a fixed-size collection of elements of the same data type. They are non-primitive data types, which means they are derived from primitive data types or other non-primitive data types.")
        println("   String: in Kotlin, a String is a data type that represents a sequence of characters. A string can be used to store and manipulate text in a program.")
        println("   Any: In Kotlin, the Any type is a supertype of all types in the language. It represents a general type that can hold any value.")
        println("   Nothing: The Nothing type is used to indicate that a function never returns a value. For example, a function that throws an exception or terminates the program will have a return type of Nothing.")
        println("   Unit: In Kotlin, Unit is another special type that represents the absence of a value. It’s similar to Void in other programming languages and is used to indicate that a function does not return a value. Unit is also a subtype of Any which means that it can be used in place of any type.")
        titleLn("${num++}- Null Safety", 0)
        code("   var a: String = \"abc\" // Regular initialization means non-nullable by default\n" +
                "   a = null // compilation error")
        println("   ----------------")
        code("   var b: String? = \"abc\" // can be set to null\n" +
                "   b = null // ok\n" +
                "   print(b)")
        println("   ----------------")
        code("   val l = a.length")
        code("   val l = b.length // error: variable 'b' can be null")
        println("   ----------------")
        code("   val a = \"Kotlin\"\n" +
                "   val b: String? = null\n" +
                "   println(b?.length)\n" +
                "   println(a?.length) // Unnecessary safe call")
        println("   ----------------")
        code("   val l = b!!.length // Exception if b is null")

        titleLn("${num++}- Late-initialized properties and variables", 0)
        println("   lateinit modifier can be used on var properties declared inside the body of a class\n" +
                "   (not in the primary constructor, and only when the property does not have a custom getter or setter),\n" +
                "   as well as for top-level properties and local variables.\n" +
                "   The type of the property or variable must be non-nullable, and it must not be a primitive type.\n" +
                "\n" +
                "   Accessing a lateinit property before it has been initialized throws a special exception that clearly identifies the property being accessed and the fact that it hasn't been initialized.\n" +
                "   tamame property haye yek class bayad meghdar avalie dashte bashand. agar az keyworde lateinit estefade konim\n" +
                "   mitavanim meghdare avalie set nakonim ama agar ghabl az meghdar dehi bekhahim az an estefade konim ba exception movajeh khahim shod.")
        code("   public class MyTest {\n" +
                "       lateinit var subject: TestSubject\n" +
                "   }")


        titleLn("${num++}- Conditional Statement", 0)
        code("   when (x) {\n" +
                "       100 -> print(\"x == 100\")\n" +
                "       0, 1 -> print(\"x == 0 or x == 1\")" +
                "       in 1..10 -> print(\"x is in the range\")\n" +
                "       in validNumbers -> print(\"x is valid\")\n" +
                "       !in 10..20 -> print(\"x is outside the range\")\n" +
                "       else -> print(\"none of the above\")\n" +
                "   }\n")
        println("   Conditional Expression")
        code("   var result:String\n" +
                "   result = when (num){\n" +
                "       1 -> \"One\"\n" +
                "       2 -> \"Two\"\n" +
                "       3 -> \"Three\"\n" +
                "   }")
        titleLn("${num++}- Arrays", 0)
        println("   (An array is a data structure that holds a fixed number of values of the same type or its subtypes)")
        println("   + operator for concat two arrays")
        println("   declare with or without types")
        code("   val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                "   for (x in cars) {\n" +
                "       println(x)\n" +
                "   }")
        code("   (0..10).toList().toTypedArray() //Arrays from Ranges")
        titleLn("${num++}- Lists (ReadOnly Access)", 0)
        code("   val numbers = listOf(1, 2, 3, 4, 5, 6)")
        titleLn("${num++}- ArrayLists (Generic Size and can add or remove element)", 0)
        code("   var arraylist = ArrayList<Int>()")
        titleLn("${num++}- Hashmaps", 0)
        code("   var WithDrawMoneyDetails: HashMap<String, Any> = HashMap<String, Any>()")
        titleLn("${num++}- Strings", 0)
        println("   Kotlin has two types of string literals: Escaped strings and Multiline strings")
        println("""   val s = "Hello, world!\n"
                       |   Escaping is done in the conventional way, with a backslash (\).""".trimMargin())
        println("\n   ----------------")
        println("   Multiline strings can contain newlines and arbitrary text. It is delimited by a triple quote (\"\"${'"'}), contains no escaping and can contain newlines and any other characters:")
        code("""   val text = ""${'"'}
   for (c in "foo")
      print(c)
  ""${'"'}""")
        println("   ------------------\n" +
                "   To remove leading whitespace from multiline strings, use the trimMargin() function:")

        code("""   val text = ""${'"'}
      |Tell me and I forget.
      |Teach me and I remember.
      |Involve me and I learn.
      |(Benjamin Franklin)
   ""${'"'}.trimMargin()""")

   println("\n    By default, a pipe symbol | is used as margin prefix, but you can choose another character and pass it as a parameter, like trimMargin(\">\").")
        titleLn("${num++}- String templates", 0)
        println("   String literals may contain template expressions – pieces of code that are evaluated and whose results are concatenated into the string.\n" +
                "   A template expression starts with a dollar sign (${'$'}) and consists of either a name:")
   code("""   val i = 10
   println("i = ${'$'}") // Prints "i = 10"""")

   println("\n   or an expression in curly braces:")
   code("""   val s = "abc"
   println("${'$'}s.length is ${'$'}{s.length}") // Prints "abc.length is 3"""")

   println("\n   You can use templates both in multiline and escaped strings. To insert the dollar sign ${'$'} in a multiline string (which doesn't support backslash escaping) before any symbol, which is allowed as a beginning of an identifier, use the following syntax:")
   code("""   val price = ""${'"'}
   ${'$'}9.99""${'"'}\n""")

        titleLn("${num++}- For Loop", 0)
        code("   for (i in 0 until 10)")
        code("   for (i in 1 until 10 step 4)")
        code("   for (i in 10 downTo 1 step 2)")
        code("   for (i in 1..6)")
        code("   for (name in list) println(\"Name: \$name\")")

        titleLn("${num++}- Break and continue labels", 0)
        println("   Now, we can qualify a break or a continue with a label:")
        code("   loop@ for (i in 1..100) {\n" +
                "       for (j in 1..100) {\n" +
                "           if (...) break@loop\n" +
                "       }\n" +
                "   }")
        titleLn("${num++}- Functions", 0)
        println("   Kotlin functions are declared using the fun keyword:")
        code("   fun double(x: Int): Int {\n" +
                "       return 2 * x\n" +
                "   }")

        println("\n   Named arguments\n" +
                "   You can name one or more of a function's arguments when calling it.\n" +
                "   This can be helpful when a function has many arguments and it's difficult to associate a value with an argument")
        code("   reformat(\n" +
                "       \"String!\",\n" +
                "       false,\n" +
                "       upperCaseFirstLetter = false,\n" +
                "       divideByCamelHumps = true,\n" +
                "       '_'\n" +
                "   )")
        println("\n   You can mark a parameter of a function (usually the last one) with the vararg modifier and\n" +
                "   In this case, you can pass a variable number of arguments to the function")
        code("   fun foo(vararg items:Int){}")
        println("\n   Local functions\n" +
                "   Kotlin supports local functions, which are functions inside other functions")
        println("\n   Functions can have generic parameters, which are specified using angle brackets before the function name:")
        code("   fun <T> singletonList(item: T): List<T> { /*...*/ }\n" +
                "   val l = singletonList<Int>(1)\n")
        titleLn("Infix Notation", 1)
        println("   Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call).\n" +
                "   Infix functions must meet the following requirements:\n" +
                "   They must be member functions or extension functions.\n" +
                "   They must have a single parameter.\n" +
                "   The parameter must not accept variable number of arguments and must have no default value.")
        code("   class DoubleVar (val value: Double){\n" +
                "       infix fun zarbdar(d: DoubleVar) : DoubleVar {\n" +
                "           return DoubleVar(this.value * d.value)\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   fun main(args: Array<String>){\n" +
                "       var d: DoubleVar = DoubleVar(2.5)\n" +
                "       var d2: DoubleVar = DoubleVar(4.0)\n" +
                "       var res: DoubleVar = d zarbdar  d2\n" +
                "       println(res.value)\n" +
                "   }\n")
        titleLn("Any, Unit, Nothing", 1)
        println("   Any: The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.\n" +
                "   Agar khorujie tabe Any Bashad bayad hatman dar khate akhar return dashte bashad va chizi return konad")
        println("   Unit: Unit is the same thing as void in Java or C.\n" +
                "   When the return type of a function is Unit it means that the function does not return anything.")
        println("   Nothing: You can use Nothing to represent “a value that never exists”:\n" +
                "   for example, if a function has the return type of Nothing, it means that it never returns (always throws an exception).")
        println("   Agar khoruji tabe sarihan tarif nashavad khoruji Unit dar nazar gerefte mishavad va nemitavanad meghdar return konad.")
        println("   dar functioni ke khorujie an any ya unit hast mitavanim exception partab konim vali agar khoruji nothing bashad bayad hatman dar har halati exception partab shavad")
        titleLn("${num++}- Classes", 0)
        println("   The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor, and some other things),\n" +
                "   and the class body surrounded by curly braces. Both the header and the body are optional; if the class has no body, the curly braces can be omitted.\n" +
                "   class Empty")
        titleLn("${num++}- Primary Constructors and Secondary Constructors", 0)
        println("   A class in Kotlin has a primary constructor and possibly one or more secondary constructors.\n" +
                "   The primary constructor is declared in the class header, and it goes after the class name and optional type parameters.")
        code("   class Kid (var name:String) {\n" +
                "       var age:Int ?= null;\n" +
                "       init {\n" +
                "           println(\"Kid \$name init!\");\n" +
                "       }\n" +
                "       constructor(name:String, age:Int) : this (name){\n" +
                "           this.age = age;\n" +
                "           println(\"Kid: (\$name - \$age)\");\n" +
                "       }\n" +
                "   }")
        titleLn("${num++}- Data Classes", 0)
        println("   Data classes in Kotlin are classes whose main purpose is to hold data." +
                "   Data classes come automatically with additional member functions that allow you to print an instance to readable output,\n" +
                "   compare instances, copy instances, and more. Data classes are marked with data:")
                code("   data class User(val name: String, val age: Int)")
        titleLn("${num++}- Companion Objects (No static keyword in kotlin)", 0)
        println("   An object declaration inside a class can be marked with the companion keyword:")
        code("   class MyClass {\n" +
                "       companion object Factory {\n" +
                "           fun create(): MyClass = MyClass()\n" +
                "       }\n" +
                "   }")
        println("\n" +
                "   Members of the companion object can be called simply by using the class name as the qualifier:")
        code("   val instance = MyClass.create()")
        println("\n" +
                "   The name of the companion object can be omitted, in which case the name Companion will be used:")

        code("   class MyClass {\n" +
                "       companion object { }\n" +
                "   }\n" +
                "   val x = MyClass.Companion\n")

                println("   Class members can access the private members of the corresponding companion object.\n" +
                "\n" +
                "   Another Example:")

                code("   class Pride {\n" +
                "       companion object {\n" +
                "           var number:Int = 0;\n" +
                "           val MAX_SPEED = 180;\n" +
                "       }\n" +
                "\n" +
                "       init {\n" +
                "           println(\"Pride Created\");\n" +
                "           number++;\n" +
                "       }\n" +
                "   }\n\n" +
                "   var pride:Pride = Pride();\n" +
                "   var pride2:Pride = Pride();\n" +
                "   var pride3:Pride = Pride();\n" +
                "   println(\"PrideClassNumber: \" + Pride.Companion.number);\n" +
                "   println(\"PrideClassMaxSpeed: \" + Pride.MAX_SPEED);"
        )

        titleLn("${num++}- Getter And Setters", 0)
        code("   class Follower(){\n" +
                "       var name:String = \"Hamed\"\n" +
                "       get(){\n" +
                "           return field + \"###\";\n" +
                "       }\n" +
                "\n" +
                "       set(value){\n" +
                "           field = value.substring(0, 6);\n" +
                "       }\n" +
                "\n" +
                "       fun sayHello() = println(\"Hello My Name Is \$name\");\n" +
                "   }")
        titleLn("${num++}- Inheritance", 0)
        code("   open class Base(p: Int)\n" +
                "   class Derived(p: Int) : Base(p)")
        titleLn("${num++}- Overriding", 0)
        println("   Kotlin requires explicit modifiers for overridable members and overrides")
        code("   open class Shape {\n" +
                "       open fun draw() { /*...*/ }\n" +
                "       fun fill() { /*...*/ }\n" +
                "   }\n" +
                "   class Circle() : Shape() {\n" +
                "       override fun draw() { /*...*/ }\n" +
                "   }")

        println("\n   A member marked override is itself open, so it may be overridden in subclasses.\n" +
                "   If you want to prohibit re-overriding, use final:")
        code("   open class Rectangle() : Shape() {\n" +
                "       final override fun draw() { /*...*/ }\n" +
                "   }")
        println()
        println("   Calling the superclass implementation")
        code("   class FilledRectangle : Rectangle() {\n" +
                "       override fun draw() {\n" +
                "           super.draw()\n" +
                "           println(\"Filling the rectangle\")\n" +
                "       }\n" +
                "   }")
        titleLn("${num++}- Abstract Classes", 0)
        code("   abstract class Polygon {\n" +
                "   abstract fun draw()\n" +
                "   }\n" +
                "   class Rectangle : Polygon() {\n" +
                "       override fun draw() {\n" +
                "           // draw the rectangle\n" +
                "       }\n" +
                "   }")
        println("\n   Another Example: ")
        code("   abstract class User(var name:String, var age:Int){\n" +
                "       abstract var x:Int; //must initialized or declare with abstract\n" +
                "       fun login() = println(\"\$name login shod!\");\n" +
                "       abstract fun sayHello();\n" +
                "   }\n" +
                "\n" +
                "   class NormalUser(name:String, age:Int, var code:Int, override var x: Int):User(name, age){\n" +
                "       override fun sayHello() = println(\"Hello from a Normal user\");\n" +
                "   }\n" +
                "\n" +
                "   class AdminUser(name:String, age:Int, var code:Int):User(name, age){\n" +
                "       override var x:Int = 16;\n" +
                "       override fun sayHello() = println(\"Hello from a Admin user\");\n" +
                "   }")

        //inja
        titleLn("${num++}- Interfaces", 0)
        println("   Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.\n" +
                "   What makes them different from abstract classes is that interfaces cannot store state. They can have properties,\n" +
                "   but these need to be abstract or provide accessor implementations.")
        println("   A class can implement multiple interface but just single class")
        code("   interface Printablee {\n" +
                "       var p:Int\n" +
                "\n" +
                "       fun print() = println(\"Printing a printable object!\")\n" +
                "       fun print2()\n" +
                "   }\n" +
                "\n" +
                "   interface Readablee {\n" +
                "       fun read()\n" +
                "   }\n" +
                "\n" +
                "   open class A\n" +
                "\n" +
                "   class Book(override var p: Int) : A(), Printablee, Readablee{\n" +
                "       override fun read() = println(\"Reading Book Started! - \$p\")\n" +
                "       override fun print2() = println(\"Alternative Printing Book Started! - \$p\")\n" +
                "   }")
        titleLn("${num++}- Enums", 0)
        code("   enum class Direction {\n" +
                "       NORTH, SOUTH, WEST, EAST\n" +
                "   }\n")
        println("   Each enum constant is an object. Enum constants are separated by commas.\n" +
                "   Since each enum is an instance of the enum class, it can be initialized as:\n")

        code("   enum class Color(val rgb: Int) {\n" +
                "       RED(0xFF0000),\n" +
                "       GREEN(0x00FF00),\n" +
                "       BLUE(0x0000FF)\n\n" +
                "       fun getDescription():String {\n" +
                "           if(this==RED) return \"Red\"\n" +
                "           return \"Not Red\"\n" +
                "       }\n" +
                "   }")

        titleLn("${num++}- Sealed classes and interfaces", 0)
        println("   Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.\n" +
                "   All direct subclasses of a sealed class are known at compile time.\n" +
                "   No other subclasses may appear outside the module and package within which the sealed class is defined.\n" +
                "   For example, third-party clients can't extend your sealed class in their code.\n" +
                "   Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.")
        println("   A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.\n" +
                "   Constructors of sealed classes can have one of two visibilities: protected (by default) or private")
        code("   sealed interface Error\n" +
                "   sealed class IOError(): Error\n" +
                "   class FileReadError(val file: File): IOError()\n" +
                "   class DatabaseError(val source: DataSource): IOError()\n" +
                "   object RuntimeError : Error")

        titleLn("${num++}- Nested Classes and Inner Classes", 0)
        println("   A nested class is a static class defined inside another class.\n" +
                "   It is not bound to a specific instance of the outer class.\n" +
                "   An inner class is a non-static class defined inside another class.\n" +
                "   it is bound to a specific instance of the outer class.\n")
        titleLn("   Inner classes", 1)
        println("   A nested class marked as inner can access the members of its outer class.\n" +
                "   Inner classes carry a reference to an object of an outer class:")
        code("   class Outer {\n" +
                "       private val bar: Int = 1\n" +
                "       inner class Inner {\n" +
                "           fun foo() = bar\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   val demo = Outer().Inner().foo() // == 1")

        titleLn("${num++}- Delegation Design Pattern", 0)
        println("   The Delegation pattern has proven to be a good alternative to implementation inheritance, and Kotlin supports it natively requiring zero boilerplate code.")
        code("   class Utilities(printer: Printer, reader: Reader, writer: Writer) :\n" +
                "       Printer by printer, Reader by reader, Writer by writer\n" +
                "\n" +
                "   interface Printer {\n" +
                "       fun print(s: String)\n" +
                "   }\n" +
                "\n" +
                "   interface Reader {\n" +
                "       fun read(s: String)\n" +
                "   }\n" +
                "\n" +
                "   interface Writer {\n" +
                "       fun write(s: String)\n" +
                "   }\n" +
                "\n" +
                "   fun main(args: Array<String>){\n" +
                "       val utilities: Utilities = Utilities(object : Printer{\n" +
                "           override fun print(s: String) {\n" +
                "               println(\"MyPrinter: \$s\")\n" +
                "           }\n" +
                "       }, object : Reader {\n" +
                "           override fun read(s: String) {\n" +
                "               println(\"MyReader: \$s\")\n" +
                "           }\n" +
                "       }, object : Writer{\n" +
                "           override fun write(s: String) {\n" +
                "               println(\"MyWriter: \$s\")\n" +
                "           }\n" +
                "       })\n" +
                "\n" +
                "       val s:String = \"Content\"\n" +
                "       utilities.print(s)\n" +
                "       utilities.read(s)\n" +
                "       utilities.write(s)\n" +
                "   }")
        println("   The by-clause in the supertype list for Utilities indicates that printer will be stored internally in objects of Utilities and the compiler will generate all the methods of Printer that forward to printer.")

        titleLn("${num++}- Delegated Properties", 0)
        println("   Simply put, delegated properties are not backed by a class field and delegate getting and setting to another piece of code.\n" +
                "   This allows for delegated functionality to be abstracted out and shared between multiple similar properties – e.g. storing property values in a map instead of separate fields.")
        println("   Vaghti az keyworde by estefade mikonim va yek property ra delegate mikonim vazife zakhire dade, khandan va neveshtane an ra be mojudiati digar vagozar mikonim")
        code("   import kotlin.reflect.KProperty\n" +
                "\n" +
                "   class Product (var name : String, var dollarPrice : Double){\n" +
                "       var tomanPrice : Double by Market()\n" +
                "\n" +
                "       fun print(){\n" +
                "           println(\"\$name -> \${dollarPrice}\\\$ -> \${tomanPrice}T\")\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   class Market {\n" +
                "       val dollarValue : Double = 50000.0\n" +
                "\n" +
                "       operator fun getValue(thisRef: Product?, property: KProperty<*>): Double {\n" +
                "           return (thisRef?.dollarPrice ?: 0.0) * dollarValue\n" +
                "       }\n" +
                "\n" +
                "       operator fun setValue(thisRef: Product?, property: KProperty<*>, value: Double) {}\n" +
                "   }\n" +
                "\n" +
                "   fun main(args: Array<String>){\n" +
                "       var product : Product = Product(\"Cheese\", 1.5)\n" +
                "       product.print()\n" +
                "       product.tomanPrice = 45000.0\n" +
                "       product.print()\n" +
                "   }")
        output("   Cheese -> 1.5\$ -> 75000.0T\n" +
                "   Cheese -> 1.5\$ -> 75000.0T")

        titleLn("${num++}- Standard Delegations", 0)
        titleLn("   Lazy", 1)
        println("   Suppose you have a property that is computationally expensive to instantiate and might not be ever needed or just for a single instance is needed.\n" +
                "   In this scenario lazy delegate is beneficial.\n" +
                "   The lazy delegate allows the value of a property to be computed only on first access and then cached.\n")

        titleLn("   observable", 1)
        println("   Suppose a scenario where you want to observe every change in the value of the parameter the old value and the new value.\n" +
                "   The handler is called every time you assign to the property (after the assignment has been performed).\n" +
                "   The observable delegate allows for a lambda to be triggered any time the value of the property changes.\n")

        titleLn("   vetoable", 1)
        println("   Suppose a scenario, where you want to intercept the assignment of a variable value.\n" +
                "   Like you have the condition until and unless it is satisfied the value of the field will not get changed.\n")

        code("   import kotlin.properties.Delegates\n" +
                "\n" +
                "   class HeavyWorker {\n" +
                "       init {\n" +
                "           println(\"Heavy Work Started\")\n" +
                "       }\n" +
                "\n" +
                "       fun print(){\n" +
                "           println(\"Heavy Printer\")\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   class Worker {\n" +
                "       val w: HeavyWorker by lazy { HeavyWorker() }\n" +
                "\n" +
                "   var salary: Int by Delegates.observable(0) { property, oldValue, newValue ->\n" +
                "       println(\"\$property: \$oldValue -> \$newValue\")\n" +
                "   }\n" +
                "\n" +
                "   var age: Int by Delegates.vetoable(20) { property, oldValue, newValue ->\n" +
                "       newValue in 20..30\n" +
                "   }\n" +
                "}\n" +
                "\n" +
                "   fun main(args: Array<String>){\n" +
                "       var worker: Worker = Worker()\n" +
                "       var worker2: Worker = Worker()\n" +
                "\n" +
                "       worker.w.print()\n" +
                "       worker.salary = 2000\n" +
                "       worker.age = 45\n" +
                "       println(worker.age)\n" +
                "       worker.age = 25\n" +
                "       println(worker.age)\n" +
                "       worker.salary = 5000\n" +
                "   }")
        output("   Heavy Work Started\n" +
                "   Heavy Printer\n" +
                "   var Worker.salary: kotlin.Int: 0 -> 2000\n" +
                "   20\n" +
                "   25\n" +
                "   var Worker.salary: kotlin.Int: 2000 -> 5000")

        titleLn("${num++}- Builder Design Pattern", 0)
        println("   Although the Builder pattern is very popular, some aspects of this pattern make it an anti-pattern when applied to Kotlin.\n" +
                "   This is because using Kotlin features, in many cases, will reward us with safer code, less prone to errors, and minimal boilerplate code.")
        println("   we can get rid of the builder pattern like so:")
        code("   data class FoodOrder(\n" +
                "       var bread: String? = \"Flat bread\",\n" +
                "       var condiments: String? = null,\n" +
                "       var meat: String? = null,\n" +
                "       var fish: String? = null\n" +
                "   )\n\n" +
                "   val order = FoodOrder(\n" +
                "       condiments = \"Pepper\", \n" +
                "       meat = \"Beef\", \n" +
                "       fish = \"Tilapia\"\n" +
                "   )")

        titleLn("${num++}- Lambda expression syntax", 0)
        println("   The full syntactic form of lambda expressions is as follows:")
        code("   val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }")
        println("   A lambda expression is always surrounded by curly braces.\n" +
                "   Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.\n" +
                "   The body goes after the ->.\n" +
                "   If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.\n" +
                "\n   it keyword")
        code("   val f:(Int) -> Unit = {println(\"FFFF: \$it\")}")
        titleLn("${num++}- Passing trailing lambdas", 0)
        println("   According to Kotlin convention, if the last parameter of a function is a function, then a lambda expression passed as the corresponding argument can be placed outside the parentheses:\n")
        code("   val product = items.fold(1) { acc, e -> acc * e }")
        println("   Such syntax is also known as trailing lambda.\n" +
                "   If the lambda is the only argument in that call, the parentheses can be omitted entirely:")
        code("   run { println(\"...\") }")

        titleLn("${num++}- Higher-order functions", 0)
        println("   A higher-order function is a function that takes functions as parameters, or returns a function.")
        titleLn("${num++}- Scope Functions", 0)
        println("   The Kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object.\n" +
                "   When you call such a function on an object with a lambda expression provided, it forms a temporary scope.\n" +
                "   In this scope, you can access the object without its name. Such functions are called scope functions.\n" +
                "   There are five of them: let, run, with, apply, and also.")
        println("   Here's a typical example of how to use a scope function:")
        code("   Person(\"Alice\", 20, \"Amsterdam\").let {\n" +
                "       println(it)\n" +
                "       it.moveTo(\"London\")\n" +
                "       it.incrementAge()\n" +
                "       println(it)\n" +
                "   }")

        println("   If you write the same without let, you'll have to introduce a new variable and repeat its name whenever you use it.")
        code("   val alice = Person(\"Alice\", 20, \"Amsterdam\")\n" +
                "   println(alice)\n" +
                "   alice.moveTo(\"London\")\n" +
                "   alice.incrementAge()\n" +
                "   println(alice)")

        println("\n   run, with, and apply reference the context object as a lambda receiver - by keyword this.\n" +
                "   Hence, in their lambdas, the object is available as it would be in ordinary class functions.\n\n" +
                "   In turn, let and also reference the context object as a lambda argument.\n" +
                "   If the argument name is not specified, the object is accessed by the implicit default name it.\n" +
                "   it is shorter than this and expressions with it are usually easier to read.\n")
        println("   Scope functions differ by the result they return:\n" +
                "   apply and also return the context object.\n" +
                "   let, run, and with return the lambda result.")
        titleLn("${num++}- Object expressions", 0)
        println("   Object expressions create objects of anonymous classes, that is, classes that aren't explicitly declared with the class declaration.\n" +
                "   Such classes are useful for one-time use.\n" +
                "   You can define them from scratch, inherit from existing classes, or implement interfaces.\n" +
                "   Instances of anonymous classes are also called anonymous objects because they are defined by an expression, not a name.")

        println("\n   Creating anonymous objects from scratch\n" +
                "   Object expressions start with the object keyword.\n" +
                "   If you just need an object that doesn't have any nontrivial supertypes, write its members in curly braces after object:")
        code("   val helloWorld = object {\n" +
                "       val hello = \"Hello\"\n" +
                "       val world = \"World\"\n" +
                "       // object expressions extend Any, so `override` is required on `toString()`\n" +
                "       override fun toString() = \"\$hello \$world\"\n" +
                "   }")

        println("\n   Inheriting anonymous objects from supertypes")
        code("   open class A(x: Int) {\n" +
                "       public open val y: Int = x\n" +
                "   }\n" +
                "   interface B { /*...*/ }\n\n" +
                "   val ab: A = object : A(1), B {\n" +
                "       override val y = 15\n" +
                "   }")
        titleLn("${num++}- Object declarations", 0)
        println("   The Singleton pattern can be useful in several cases, and Kotlin makes it easy to declare singletons")
        code("   object DataProviderManager {\n" +
                "       fun registerDataProvider(provider: DataProvider) {\n" +
                "           //...\n" +
                "       }\n" +
                "       val allDataProviders: Collection<DataProvider>\n" +
                "           get() = //...\n" +
                "   }")
        println("\n   To refer to the object, use its name directly:")
        code("   DataProviderManager.registerDataProvider(...)")
        println("   Such objects can have supertypes:")
        titleLn("${num++}- Packages", 0)
        println("   A source file may start with a package declaration:")
        code("   package org.example\n" +
                "   fun printMessage() { /*...*/ }\n" +
                "   class Message { /*...*/ }\n" +
                "   // ...\n")
        println("   All the contents, such as classes and functions, of the source file are included in this package.\n" +
                "   So, in the example above, the full name of printMessage() is org.example.printMessage, and the full name of Message is org.example.Message.\n" +
                "   If the package is not specified, the contents of such a file belong to the default package with no name.")
        println("\n   Imports")
        println("   You can import either a single name:")
        code("   import org.example.Message // Message is now accessible without qualification")
        println("\n" +
                "   or all the accessible contents of a scope: package, class, object, and so on:")

        code("   import org.example.* // everything in 'org.example' becomes accessible")
        println("\n   If there is a name clash, you can disambiguate by using as keyword to locally rename the clashing entity:")
        code("   import org.example.Message // Message is accessible\n" +
                "   import org.test.Message as TestMessage // TestMessage stands for 'org.test.Message'")

        titleLn("${num++}- Generics", 0)
        println("   Classes in Kotlin can have type parameters, just like in Java:")
        code("   class Box<T>(t: T) {\n" +
                "       var value = t\n" +
                "   }")

        println("\n" +
                "   To create an instance of such a class, simply provide the type arguments:")
        code("   val box: Box<Int> = Box<Int>(1)\n\n" +
                "   But if the parameters can be inferred, for example, from the constructor arguments, you can omit the type arguments:\n" +
                "   val box = Box(1)")
        println("\n   Generic functions\n" +
                "   Classes aren't the only declarations that can have type parameters.\n" +
                "   Functions can, too. Type parameters are placed before the name of the function:")
        code("   fun <T> singletonList(item: T): List<T> {\n" +
                "       // ...\n" +
                "   }\n" +
                "\n" +
                "   fun <T> T.basicToString(): String { // extension function\n" +
                "       // ...\n" +
                "   }")
        println("\n" +
                "   To call a generic function, specify the type arguments at the call site after the name of the function:")
        code("   val l = singletonList<Int>(1)")
        println("\n" +
                "   Type arguments can be omitted if they can be inferred from the context, so the following example works as well:")
        code("   val l = singletonList(1)")
        titleLn("${num++}- Extensions", 0)
        println("   Kotlin provides the ability to extend a class or an interface with new functionality without having to inherit from the class or use design patterns such as Decorator.\n" +
                "   This is done via special declarations called extensions.\n" +
                "\n" +
                "   For example, you can write new functions for a class or an interface from a third-party library that you can't modify.\n" +
                "   Such functions can be called in the usual way, as if they were methods of the original class.\n" +
                "   This mechanism is called an extension function.\n" +
                "   There are also extension properties that let you define new properties for existing classes.\n")
        println("   Extension functions")
        println("   To declare an extension function, prefix its name with a receiver type, which refers to the type being extended.\n" +
                "   The following adds a swap function to MutableList<Int>:")
        code("   fun MutableList<Int>.swap(index1: Int, index2: Int) {\n" +
                "       val tmp = this[index1] // 'this' corresponds to the list\n" +
                "       this[index1] = this[index2]\n" +
                "       this[index2] = tmp\n" +
                "   }")

        println("\n" +
                "   The this keyword inside an extension function corresponds to the receiver object (the one that is passed before the dot).\n" +
                "   Now, you can call such a function on any MutableList<Int>:")
        code("   val list = mutableListOf(1, 2, 3)\n" +
                "   list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'\n")
        println("\n" +
                "   This function makes sense for any MutableList<T>, and you can make it generic:")
        code("   fun <T> MutableList<T>.swap(index1: Int, index2: Int) {\n" +
                "       val tmp = this[index1] // 'this' corresponds to the list\n" +
                "       this[index1] = this[index2]\n" +
                "       this[index2] = tmp\n" +
                "   }")
                println("\n" +
                "   You need to declare the generic type parameter before the function name to make it available in the receiver type expression.\n" +
                "   For more information about generics, see generic functions.")

        titleLn("${num++}- Files", 0)
        code("   var file:File = File(\"src/MyPackage/test.txt\");\n" +
                "\n" +
                "   println(\"File Abs Path: \" + file.absolutePath);\n" +
                "   println(\"File Can Path: \" + file.canonicalPath);\n" +
                "\n" +
                "   var line:Int = 0;\n" +
                "   file.forEachLine{ \n" +
                "       println(\"\${line++}: \$it\");\n" +
                "   }")

        titleLn("${num++}- Exception Handling", 0)
        code("   try{\n" +
                "       println(\"Value: \" + list[3] / 1);\n" +
                "   }\n" +
                "   catch (ex:ArithmeticException){\n" +
                "      println(\"ArithmeticException\");\n" +
                "   }\n" +
                "   catch (ex:IndexOutOfBoundsException){\n" +
                "      println(\"IndexOutOfBoundsException\");\n" +
                "   }\n" +
                "   catch (ex:Exception){\n" +
                "      println(\"Exception\");\n" +
                "   }\n" +
                "   finally {\n" +
                "      println(\"Finaly Finished!\");\n" +
                "   }")
        println("\n   Another Example")
        code("   val result:Int?;\n" +
                "   result = try{10/0} catch (ex:Exception){null};\n" +
                "   println(\"Result: \" + result);")
    }
}

fun main(args: Array<String>) {
    var roadMap = RoadMap()
    roadMap.print();
}