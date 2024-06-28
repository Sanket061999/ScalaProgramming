package com.closer
//closer where varible are defined outside funtion defination
object Demo {
  def main(args: Array[String]): Unit = {
    println(multiplier1(5))

  }
  val fact=10
  val multiplier1=(x:Int)=>x*fact //closer //i.e.fact is define outside the function

  val isEven=(x:Int)=>x%2==0
  val isEven1: Int => Boolean =(x) => x%2==0  //if you write the return type
}
