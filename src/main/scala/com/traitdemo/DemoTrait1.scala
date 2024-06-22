package com.traitdemo

trait Vehicle1{
  def engine(): Unit = {
    println("Vehicle1 engine start")
  }

}


trait Vehicle2 {
  def break(): Unit = {
    println("Vehicle2 break")
  }


  def engine(): Unit = {
    println("Vehicle2 engine start")
  }

  def tyres():Unit

}

class Maruti1 extends Vehicle1 with Vehicle2{
  override def tyres(): Unit = {
    println("vehicle 2 tyres override")
  }

  override def engine(): Unit = super.engine()
  }



object DemoTrait1 {

  def main(args: Array[String]): Unit = {


val m1=new Maruti1
m1.engine()
m1.break()
m1.tyres()
}
}
