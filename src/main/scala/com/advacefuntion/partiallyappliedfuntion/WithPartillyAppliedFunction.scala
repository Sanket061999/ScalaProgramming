package com.advacefuntion.partiallyappliedfuntion

import java.util.Date
object WithPartillyAppliedFunction {

  def log(date:Date, msg:String): Unit = {
    println(msg+date)
  }

  def main(args: Array[String]): Unit = {
    var date=new Date()
    val logWithDate = log(date,_:String)  // this type of variable method is called lamda funtion
    //you can't have this fully implemented like log(date,"sa")

    //you can have multiple method like this


//    log(date,"Hello 1")
//    Thread.sleep(2000)
//
//    log(date,"Hello 2")
//    Thread.sleep(2000)
//
//    log(date,"Hello 2")
//    Thread.sleep(2000)

logWithDate("Hello1")
logWithDate("Hello2")
logWithDate("Hello3")


  }

}
