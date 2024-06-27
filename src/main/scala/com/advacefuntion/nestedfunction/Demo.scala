package com.advacefuntion.nestedfunction

object Demo {

  def main(args: Array[String]): Unit = {
    val printHello=(a:String)=>println(a+" hello")  //function inside the function


    printHello("K")
    printHello("KS")
    printHello1("val")


    def printHello1(a: String): Unit = {
      println(a + " HI")
    }
  }
}
