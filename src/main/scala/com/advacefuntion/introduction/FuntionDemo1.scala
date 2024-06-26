package com.advacefuntion.introduction

object FuntionDemo1{

  def sum(x:Int, y:Int):Int={
    return (x+y)
  }

  def sumF=(x:Int,y:Int)=>x+y

  def main(args: Array[String]): Unit = {
    println(sumF(10,11))
  }

}
