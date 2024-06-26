package com.advacefuntion.anonymousfunction

object DemoFunctionCallByName {

  def printIncrementValue(x:Int): Unit = {
  println("Addition value is "+increment(x))
  }

  def increment(y:Int): Int = {
    y+1
  }

  def main(args: Array[String]): Unit = {
    printIncrementValue(2)
  }
}
