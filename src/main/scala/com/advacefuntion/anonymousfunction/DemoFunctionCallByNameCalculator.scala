package com.advacefuntion.anonymousfunction

object DemoFunctionCallByNameCalculator {

def calculator(m:(Int,Int)=>Int,x:Int,y:Int): Int = {
    m(x,y)
  }
var add=(x:Int,y:Int)=>x+y

  def main(args: Array[String]): Unit = {
    println(calculator(add,3,2))
  }
}
