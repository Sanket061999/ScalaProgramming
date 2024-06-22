package com.traitdemo
//Value class : can allocate the runtime object
// because it taking val as argument so we cant change it
//Value class always have one parameter with type as Val
//You can not extend the value class
//Suzuki is value class as it also extend AnyVal
//Value class can not extend a trait that why we have universal trait
//If trait is extending Any trait then it called as Universal trait

trait CarE extends Any{  //Universal trait
  def print():Unit={println(this)}
}

class Suzuki(val x:Int) extends AnyVal with CarE { //Value class
  //val x=10//You can not define any variable in the value class
  //You can only define the methods
  //Benifit of value class
  //1. Less initialization
  //2. Better performance
  //3. Less memory utilization
  //Use case : for performance and memory optimization
  def hello(): Unit = {
    println("Hello Sanket")
  } }
object DemoTrait4 {
  def main(args: Array[String]): Unit = {
 val m1= new Suzuki(5)
 m1.print()
    m1.hello()
  } }
