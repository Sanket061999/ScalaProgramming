package com.advacefuntion

object FunctionByValueDemo {
//passing funtion name
  def exec(t:Long):Long={
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
    //The inside function will execute the first then outside
    //Since inside function first , it call execute function using value got by inner method

  }

}
