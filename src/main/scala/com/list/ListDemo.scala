package com.list

//List is similar to array, but List is immutable , you can not change the content of the list
object ListDemo {

  def main(args: Array[String]): Unit = {
    var num=List(0,1,2,3,4,5,6,7,8,9)
    for (i<-num){
      print(i+" ")
    }
    println()

    for (i <- num if i%2==0) {
      print(i + " ")
    }
    println()

    for (i <- num if i % 2 == 0;if i!=4) {
      print(i + " ")
    }

    println()
    for (i <- num if i % 2 == 0;if i!=4; if i!=2) {
      print(i + " ")
    }

    println()
    for (i <- num if i % 2 == 0; if i != 4 && i != 2) {
      print(i + " ")
    }


    println()
    for (i <- num if i % 2 == 0; if i != 4 || i != 2) {
      print(i + " ")
    }

  }
}
