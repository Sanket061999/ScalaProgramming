package com.advacefuntion.introduction

object FuntionDemo1{

  def sum(x:Int, y:Int):Int={
    return (x+y)
  }

  def sumF=(x:Int,y:Int)=>x+y

  def main(args: Array[String]): Unit = {
    println(sumF(10,11))
  }

  val isEven = (x: Int) => x % 2 == 0
  val isEven1: Int => Boolean = (x) => x % 2 == 0 //if you write the return type
}
