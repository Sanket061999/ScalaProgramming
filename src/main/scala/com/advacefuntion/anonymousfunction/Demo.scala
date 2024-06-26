package com.advacefuntion.anonymousfunction
//Without def and name of the function also called as anonymous or lamda function
//First class funtion -> pass the function as parameter and define its value
object Demo {

  def increment(x:Int):Int={
    x+1  //last line by default taken as return // no need to write a return keyword
  }
  def printHelloWorld(): Unit = {
    println("Aniket")
  }

  def addNormal(a:Int,b:Int): Int = {
    a+b
  }


  var incrementFunc=(x:Int) => x+1
  var printHelloWorldFunc=()=>println("Aniket Func")
  var addFun=(x:Int,y:Int)=>x+y


  def main(args: Array[String]): Unit = {
    println(incrementFunc(10))
    println("--------")
    println(printHelloWorldFunc())
    printHelloWorldFunc()
    println("--------")
    println(addFun(10,12))

  }
}
