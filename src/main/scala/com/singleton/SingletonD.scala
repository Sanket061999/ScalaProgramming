package com.singleton

object Democla{
  var x=1
  var y=10
  //Same applicable for method
}
object SingletonD {
  def main(args: Array[String]): Unit = {
    println(Democla.x+" "+ Democla.y)  //we can not create the object of object
  }}
