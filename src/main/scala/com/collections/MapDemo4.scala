package com.collections

object MapDemo4 {
  def main(args: Array[String]): Unit = {
    var cars = Map(
      "Mercedes" -> "High Range",
      "BMW" -> "High Range",
      "Toyota"->" Mid Range",
      "Jaguar"->" High Range",
      "Nano"->"Low Range"
    ) //immutable

    //for duplicate keys it will consider the original value
    //sequence is not preserved


    println(cars)
    cars += ("Suzuki" -> "Mid Range") //its getting overidden and reassign //its not changing the value as it is immutalble
    cars += ("Nano" -> "Went")
    //for val you can not add the key value as you can not change it and can not reassign it
    println(cars)

    val carsm = scala.collection.mutable.Map(
      "Mercedes" -> "High Range",
      "BMW" -> "High Range",
      "Toyota"->" Mid Range",
      "Jaguar"->" High Range",
      "Nano"->"Low Range"
    ) //mutable

    println(carsm)
    carsm += ("Suzuki" -> "Mid Range") //as its a val still we can add the value
    println(carsm)



  }
}
