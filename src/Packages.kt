//dar yek package be tore pishfarz mitavan az tamame class haye darune
//an package bedune import estefade kard
//agar bekhahim az yek package khareji estefade konim bayad an hara import konim
//ba estefade az * mitavanim tamame yek package ra ba tamame class haye darunash
//import konim. ya daghighan moshakhas konim ke kodam class ya function ra mikhahim import konim

//baraye sakhte package yek folder ba name moshakhas misazim va darune tamame file haye an
//minevisim package PackageName

//baraye importe package, package bayad darune foldere src ma bashad
//ya darune sdk ma bashad ke ide an ra mishenasad

import MyPackage.mainHello;
import MyPackage.TestClass;
import MyPackage.TestObject;

//yamitavanim hame ra ba ham import konim
//import MyPackage.*;

fun main (args: Array<String>){
    mainHello();
    TestClass().sayHello();
    TestObject.sayHello();
}