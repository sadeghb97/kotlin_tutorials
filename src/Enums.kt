/*enum class Status {
    DRAFT,WAITING,PUBLISHED
}*/

//mitavanim dar enum property va method ham dashte bashim
enum class Status(val statusId:Int) {
    DRAFT(0),WAITING(1),PUBLISHED(2);

    fun getDescription() =
        if(this==DRAFT) "Drafted" else if(this==WAITING) "Waiting" else "Published";
}

class Article(var status:Status)

fun main (args: Array<String>){
    val article:Article = Article(Status.WAITING);
    println("statusId: " + article.status.statusId);
    println("Description: " + article.status.getDescription());
}