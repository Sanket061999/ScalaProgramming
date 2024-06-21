package com.companion

class CompanionDemo{
  var x=5
  def getValue():Unit= {
    println(s"FROM CLASS The value of x ${x} and y is ${CompanionDemo.y}")
  }}

object CompanionDemo {
  var y=2.2
  def main(args: Array[String]): Unit = {
    val obj=CompanionDemo.apply()
    println(s"FROM OBJECT value of x is ${obj.x} and the value of y is ${y}")
    obj.getValue()
  }}




