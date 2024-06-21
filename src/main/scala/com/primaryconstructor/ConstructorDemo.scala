package com.primaryconstructor

class demoClass{
  val x=10
  val y=12

  def addNo()=(x+y).toDouble

  println(s"x=${x} and y=${y}")
  println(f"x=${x} and y=${y}")
  println("x="+x+" and y="+y)

  var add=addNo()
  println("The value of addNo method is "+add)
}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Sanket")
    val obj1=new demoClass
    println(obj1.addNo())
  }
}
