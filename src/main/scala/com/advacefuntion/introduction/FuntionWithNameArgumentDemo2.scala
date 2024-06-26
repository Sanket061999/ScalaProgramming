package com.advacefuntion

object FuntionWithNameArgumentDemo2{

  def sum(x:Int, y:Int):Int={
    println("x= "+x +"  and y= "+y)
    return (x+y)
  }

  def main(args: Array[String]): Unit = {

    println(sum(y=10,x=11))
    println(sum(11,10))
  }

}
