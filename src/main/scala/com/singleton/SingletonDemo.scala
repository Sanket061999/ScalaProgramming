package com.singleton
class DemoclassA(a:Int, b:Int){
  var x=a
  var y=b
  //Same applicable for method
}
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    val obj1=new DemoclassA(10,20)
    println(obj1.x+" "+obj1.y)
    val obj2=new DemoclassA(100,200)
    println(obj2.x+" "+ obj2.y)
  }}
