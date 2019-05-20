fun main(args: Array<String>){
    for (i in 0 until 10){
        println("First: " + i);
    }

    for (i in 1 until 10 step 4) println("SecondStep4: " + i);
    for (i in 10 downTo 1 step 2) println("ThirdStep2: " + i);
    for (i in 1..6) println("Fourth: " + i);

    val list:List<String> = listOf("Sadegh", "Ali", "Reza", "Hosein", "Saeid");
    for (name in list) println("Name: $name");
    for ((index, name) in list.withIndex()) println("${index}: $name");

    println("Im Alive!");
    var resume:Boolean = true;
    while(resume){
        println("Stil Alive!");
        Thread.sleep(1000);
        if(list.random().equals("Reza")) resume = false;
    }

    do{
        println("TryAgain!");
    } while (resume);


    //Mitavan halghe hara namgozari kard
    //mesali az karbord an
    outer@ for(i in 1..10){
        inner@ for(j in 1..10){
            println("$i - $j");
            if(i==2 && j==7) break;
            if(i==6 && j==8) break@outer;
        }
    }
}