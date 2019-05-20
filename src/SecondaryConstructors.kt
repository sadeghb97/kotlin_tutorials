//class ha yek primary constructor darand. vorudy haye primary constructor
//dar joloye name class tuye perantez gozashte mishavand
//dar surate niaz, badane primary constructor darune blocke init
//neveshte mishavad va dar in block ma be vorudi haye primary constructor dastresi darim

//blocke init hamishe zamani ke shey sakhte mishavad ejra mishavad
//hata agar hich model constructori tarif nakonim. na primary va na secondary

//ba estefade az keyworde constructor mitavanim har tedad constructor ke bekhahim
//ijad konim. be in constructor ha secondary constructor migueim
//dar surati ke primary constructor tarif shavad va bekhahim secondary constructor
//ham tarif konim bayad secondary constructor ha az primary constructor ers bari konand

//agar hich model constructori tarif nakonim mitavanim ba () shey besazim
//vali agar yek constructor dashte bashim che primary che secondary
//baraye in ke ba () shey besazim bayad hatman default constructor tarif konim

class Kid (var name:String) {
    var age:Int ?= null;

    init {
        println("Kid init!");
    }

    constructor(name:String, age:Int) : this (name){
        this.age = age;
        println("Kid: ($name - $age)");
    }
}

fun main (args: Array<String>){
    var kid:Kid = Kid("Sadegh", 23);
}