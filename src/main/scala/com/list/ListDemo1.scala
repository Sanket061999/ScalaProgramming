package com.list

import scala.util.control.Breaks

//List is similar to array, but List is immutable , you can not change the content of the list
object ListDemo1 {

  def main(args: Array[String]): Unit = {
    var num = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var evenNo = for (i <- num if i % 2 == 0) yield i
    println(evenNo)
    println(num)
    println("======")
    var num2 = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val breakObject=new Breaks;
    breakObject.breakable {
      for (i <- num2 if i % 2 == 0){
        println(i)
        if (i==4){
          println("Breaking at 4")
          breakObject.break
        }
      }
    }


    var breakO=new Breaks
    breakO.breakable{
      for(i<-1 until 10){
        print(i+" ")
        if (i==8) {
          breakO.break()
        }
      }
    }


  }


}
