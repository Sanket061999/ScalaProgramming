package com.exceptionhandling

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object DemoTryCatch {
  def main(args: Array[String]): Unit = {
    try {
      //val f = new FileReader("input.txt")
      val temp=10/0;
      val arr1= new Array(10)
      println(arr1(11))
    } catch {
      case ee: FileNotFoundException => {
        println("file not found exception"+ee)
      }
      case e: IOException=>{
        println("IO Exception is found")
      }
      case ea: ArithmeticException => {
        println("arithmatic exception   -"+ea)
      }
//      case _:Exception=>{
//        println("It will handle all the exception")
//      }


//      case xyz: Exception => {
//       println("all other exception")
//      }




      case otherException => {
        println("all other exception")

      }


        /*
        or
        case xyz:Exception=>{
        -----
        }
          case allException=>{
        -----
        }
          case otherException=>{
        -----
        }
          */

    }
    finally{
      println("Finally block is always execute")
    }
  }
}
