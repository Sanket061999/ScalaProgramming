package com.advacefuntion.anonymousfunction

object DemoFunctionCallByFunction1 {

  def printIncrementValue1(m:(Int) =>Int,num:Int):Unit={   //inner function is returning Int
    println("final value is "+m(num))
  }
  def increment1(v:Int):Int= {
    println("The value is " + v)
    var z = 1 + v
    println("The value is " + v)
    z
  }
  def main(args: Array[String]): Unit = {
    printIncrementValue1(increment1,121)
  }
}
