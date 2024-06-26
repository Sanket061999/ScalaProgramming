package com.advacefuntion.anonymousfunction

//Without def and name of the function also called as anonymous or lamda function
//First class funtion -> pass the function as parameter and define its value
object Demo3Map {

  def square(x: Int): Int = x * x
  var squareFun=(x:Int)=>x*x

  def main(args: Array[String]): Unit = {
    var listOfno = List(1, 2, 3, 4, 45, 6, 7)
    println(listOfno)
    var squareOfNum=listOfno.map(squareFun)
    println(squareOfNum)

    println("--------")
    var cubeOfNum = listOfno.map(x=>x*x*x)
    var multiplyBy3 = listOfno.map(_*3)
//    var multiplyBy3 = listOfno.map(_*_) // it expect _ no. of element here its 2


    println(cubeOfNum)
    println(multiplyBy3)
  }


}
