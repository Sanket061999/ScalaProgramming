package com.primaryconstructor
class demoClass2(var a:Int=99, var b:Double=1.11, var c:String="Hello Its a default string") {
  var x = a
  var y = b
  var z = c
  println(f"${x} ${y} ${z}")
}

object constructorDemo2 {
  def main(args: Array[String]): Unit = {
    var obj1=new demoClass2()
    var obj2=new demoClass2(12)
    var obj3=new demoClass2(12,11.1)
    var obj4=new demoClass2(1,1,"Sanket")
    var obj5=new demoClass2(c="Aniket or Shiwam",a=123,b=1.1)
  }}
