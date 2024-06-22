package com.exceptionhandling

import scala.util.{Failure, Success, Try}

object TrySuccessFailureClass2 {
  def main(args: Array[String]): Unit = {

    val a = Try(10 / 0)
    println("---" + a)

    a match {
      case Success(value) => println(a)
      case Failure(exception) => errorHandlingFunction(exception)

    }
  }

  def errorHandlingFunction(exception: Throwable): Unit = {
    println(exception)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("==== Arithmetic exception ----")
    }
  }
}
