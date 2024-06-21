package com.caseclass

case class Car(name:String, model:String){
  val carName=name
  val carModel=model
  def printDetails():Unit={
    println(s"Car Name is : ${carName} and Car Model is ${carModel}")
  }}
object CaseClassDemoA {
  def main(args: Array[String]): Unit = {
    val bmw=Car(name="BMW", model="550")
    //No need to write new keyword, because apply method is autogenerated in case class
    bmw.printDetails()
    //bmw.name="B.M.W."//constructor parameter is val by default
    //therefore mutator method is not generated
  }}
