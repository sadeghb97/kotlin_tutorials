import java.io.File

fun main(args: Array<String>){
    //adres ra nesbat be roote proje midahim
    var file:File = File("src/MyPackage/test.txt");

    println("File Abs Path: " + file.absolutePath);
    println("File Can Path: " + file.canonicalPath);

    var line:Int = 0;
    file.forEachLine{ println("${line++}: $it"); }
}