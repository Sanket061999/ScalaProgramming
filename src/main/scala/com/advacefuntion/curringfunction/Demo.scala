package com.advacefuntion.curringfunction

object Demo {
//instead of passing multple argument using scala
//you can pass multiple argument using () brackets

def printSomething(str1:String)(str2: String):String={
  str1+" "+str2
}

def printSomeThing1(str1:String)=(str2:String)=>str1+" "+str2

  def main(args: Array[String]): Unit = {
    val a="Sanket"
    val b="Aniket"
    print("HI "+printSomething(a),(b))
    println()
    print("HI "+printSomeThing1(a),(b))

  }
}
