package com.functions

class Car {
  var name = "Scoda"
  var tax = 1000

  def cost(basicCost: Int) = basicCost + tax

  def checkTax()={
    tax
  }
}

object DemoClassObject {
  def main(args: Array[String]): Unit = {
    println("Sanket1")
    var obj1=new Car
    println(obj1.name+" "+obj1.tax)
    obj1.tax=111
    println(obj1.name+" "+obj1.tax+" final cost"+obj1.cost(99999))
    println(obj1.checkTax())



  }}

