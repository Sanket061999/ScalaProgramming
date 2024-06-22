//package com.loopingstatement
//
//import scala.util.control.Breaks._
//
//object DoWhileLoopDemo {
//  def main(args: Array[String]): Unit = {
//    var count = 0
//    breakable {
//      do{
//        println("Count is: " + count)
//        count += 1
//        if (count >= 5) break
//      } while (true)
//    }
//  }
//}