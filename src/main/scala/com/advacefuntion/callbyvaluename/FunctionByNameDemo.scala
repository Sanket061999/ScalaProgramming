package com.advacefuntion
object FunctionByNameDemo {

  def exec(t: =>Long):Long={  //little change of =>
    println(t)
    println("In exec")
    return t
  }

  def time():Long={
    println("In time")
    return System.nanoTime()
  }

  def main(args: Array[String]): Unit = {
    println("In main")
    println(exec(time()))
    //The outside  function will execute the first
    //whenever you call reference will will execute the inner function
    //See the following reference
  }
}


//package com.advacefuntion.anonymousfunction
//
//object DemoFunctionCallByNameCalculator {
//
//  def calculator(m:(Int,Int)=>Int,x:Int,y:Int): Int = {
//    m(x,y)
//  }
//  var add=(x:Int,y:Int)=>x+y
//
//  def main(args: Array[String]): Unit = {
//    println(calculator(add,3,2))
//  }
//}
