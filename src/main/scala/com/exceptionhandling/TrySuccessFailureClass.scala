package com.exceptionhandling

import scala.util.{Try, Success, Failure}

object TrySuccessFailureClass {
  def main(args: Array[String]): Unit = {
   // val a = Try(10 / 5)
    val a = Try(10 / 0)

    println("---" + a)

    a match {
      case Success(value) => {
        println(a)
      }
      case Failure(exception) => {
        println(a)
      }

    }

  }
}
