package com.functions

object HelloDemo {
  def main(args: Array[String]): Unit = {
    println("Sanket")
    println("The value is "+add(10,20))
    println("The without return  is "+addWithoutReturn(100,20))
    println("short add "+shortAdd(12,12))
  }

  def add(a: Int, b: Int): Int ={
    var z = a + b
    return z
  }

  def addWithoutReturn(a: Int, b: Int) = {
    var z = a + b
    z
  }

  def shortAdd(a:Int,b:Int)=a+b





}
