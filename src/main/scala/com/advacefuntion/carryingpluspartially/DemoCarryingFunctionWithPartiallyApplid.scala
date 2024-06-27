package com.advacefuntion.carryingpluspartially

object DemoCarryingFunctionWithPartiallyApplid {
//curring funtion declaration
def add2(a:Int)(b:Int)=a+b

  def main(args: Array[String]): Unit = {
    //partially applied function
    val sum=add2(23)_;
    println(sum(1));
  }
}
