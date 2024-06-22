package com.traitdemo

trait Vehicle{
  def engine(): Unit = {
    println("Vehicle engine start")
  }
  def break():Unit={
    println("Vehicle break")
  }
  def tyres():Unit

}

class Maruti extends Vehicle{
  override def engine(): Unit = {
    println("Maruti engine start")
  }


  def tyres(): Unit = {
    println("Maruti tyres")
  }}

object DemoTrait {

  def main(args: Array[String]): Unit = {


val m1=new Maruti
m1.engine()
m1.break()
m1.tyres()
}
}
