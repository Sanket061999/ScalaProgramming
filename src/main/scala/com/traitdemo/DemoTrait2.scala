package com.traitdemo

abstract class Vehiclea {
  def category(): Unit
}


trait Vehicle11 {
  var x=100
  val t=100
  def engine(): Unit = {
    println("Vehicle11 engine start "+x+" "+t)
  }

}


trait Vehicle22 {
  def break(): Unit = {
    println("Vehicle22 break")
  }


  def tyres(): Unit

}

class Maruti11 extends Vehiclea with Vehicle11 with Vehicle22 {
  x=20000
  override val t=10000
  override def tyres(): Unit = {
    println("vehicle 22 tyres override")
  }

  override def category(): Unit = {

    println(" It a vehicle category for abstract class implemented method")
  }

  override def engine(): Unit = super.engine()
}


object DemoTrait2 {

  def main(args: Array[String]): Unit = {


    val m1 = new Maruti11
    m1.engine()
    m1.break()
    m1.tyres()
    m1.category()
  }
}
