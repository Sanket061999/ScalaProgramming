package com.advacefuntion.nestedfunction

object Demo1 {

  def main(args: Array[String]): Unit = {

    printHello1("val")


    def printHello1(a: String): Unit = {
            def printInner(a:String):Unit={
               println(a+" snake")
           }
      printInner(a)
    }
  }
}
