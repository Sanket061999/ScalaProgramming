package com.auxiliaryconstructor
class demoClass1(var a:Int, var b:Double, var c:String){
  var x=a
  var y=b
  var z=c
  println(f"${x} ${y} ${z}")
  println("----------------")

  def this()={  //1st aux constructor
    this(1,1.1, "Hello0")
    println("I came into auxiliary constructor with 0 parameter")
  }
  def this(a:Int)={  //2nd aux constructor
    this(a, 1.1, "Hello1")
    println("I came into auxiliary constructor with 1 parameter")
  }
  def this(a: Int, b:Float) = {   //3rd aux constructor
    this(a, b, "Hello2")
    println("I came into auxiliary constructor with 2 parameter")
  }

  def this(c:String) = { //2nd aux constructor
    this(1, 1.1, c)
    println("I came into auxiliary constructor with 1 parameter")
  }
}
object constructorDemo1 {
  def main(args: Array[String]): Unit = {
    var obj1=new demoClass1(1,1.1,"Sanket")
    var obj11 = new demoClass1()
    var obj2 = new demoClass1(12)
    var obj3 = new demoClass1(12, 11.1)
    var obj5 = new demoClass1(c = "Aniket or Shiwam", a = 123, b = 1.1)
    var obj6 = new demoClass1(c = "Aniket or Shiwam")
  }}
