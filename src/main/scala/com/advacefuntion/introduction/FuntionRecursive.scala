package com.advacefuntion

object FuntionRecursive{

  def factorial(n:Int): Int = {
    if (n<=1){
      return 1
    }
    else{
      var temp=factorial(n-1)
      return n * temp
    }
  }
  def main(args: Array[String]): Unit = {
        println(factorial(1))
        println(factorial(2))
        println(factorial(5))
        println(factorial(10))
  }

}
