package com.primaryconstructor

//Parameterized Constructor
class demoClass1(var a:Int, var b:Double, var c:String){
  var x=a
  var y=b
  var z=c

  def addNum()=x+y

}

object constructorDemo1 {
  def main(args: Array[String]): Unit = {
    var obj1=new demoClass1(1,1.1,"Sanket")
    println(obj1.addNum())


  }
}
