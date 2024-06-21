package com.string

case class Car(name:String,cost:Int){
}

object CaseClassPatternMatching {
  def main(args: Array[String]): Unit = {
    var car1 =Car("BMW",100)
    var car2 =Car("Mercedes",1000)
    var car3 = Car("Maruti", 500)

    for (car <- List(car1,car2,car3)){
      car match{
        case Car("Mercedes",1000) => println("Car is mercedes")
        case Car("BMW",100) => println("Car is BMW")
        case Car(name,cost) => println("Car name is "+name +" Cost is "+cost)
      }}}}
