package com.conditionalstatement
//Same as java
object DemoCondition {
  def main(args: Array[String]): Unit = {
    var x=10

    if (x<=10) {
      println("x is less than 10")
    }

    if (x > 50) {
      println("x is greater than 50");
    }else{
      println("x is less than 50");
    }


    x =50
    if (x > 50) {
      println("x is greater than 50");
    } else if (x<50) {
      println("x is less than 50");
    }else{
      println(" x is 50")
    }
  }
}
