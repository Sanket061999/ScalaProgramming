package com.exceptionhandling

import scala.util.control.Exception.catching

object UsingCatching {
  def main(args: Array[String]): Unit = {
    val a = 10 / 5
    println(a + " -----")

    val catchException = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => println("Sanket Arithmetic exception has occured"))
    //instead of println we can call any funtion in above statement
    val b = catchException(10 / 5)
    println(b)

    val c = catchException(10 /0)
    println(c)

//    if (c.!=()){
//      println(c)
//    }
  }}

