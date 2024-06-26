package com.advacefuntion.anonymousfunction

object DemoFunctionCallByFunction {

  def printIncrementValue(m: =>Int)={   //inner function is returning Int
    println("final value is "+m)
  }
  def increment():Int={
    var v=2
    println("The value is "+v)
    v+=1
    println("The value is "+v)
    v
  }

  def main(args: Array[String]): Unit = {
    printIncrementValue(increment())
  }
}
