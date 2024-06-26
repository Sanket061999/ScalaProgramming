package com.advacefuntion.introduction

object FuntionDefaultParameter{

  def sum(x:Int=1111, y:Int=1111):Int={
    println("x= "+x +"  and y= "+y)
    return (x+y)
  }

  def main(args: Array[String]): Unit = {
    println(sum(10,11))
    println(sum())
    println(sum(1))
    println(sum(y=1))
  }

}
