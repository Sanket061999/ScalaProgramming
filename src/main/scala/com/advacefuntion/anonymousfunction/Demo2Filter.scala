package com.advacefuntion.anonymousfunction

//Without def and name of the function also called as anonymous or lamda function
//First class funtion -> pass the function as parameter and define its value
object Demo2Filter {

  def divisibleByThree(x:Int)={x%3==0}

  //anonymous function
  var divisibleByThreeFun=(x:Int)=>x%3==0

  def main(args: Array[String]): Unit = {
    var listOfno = List(1, 2, 3, 4, 45, 6, 7)
    listOfno.foreach(x=> if (divisibleByThree(x)){println(x+" is divisible")  } else{ println("NOT")  })


    //Use with filter
    println("----Use with filter----")
    var divisibleByThreeFilter=listOfno.filter((x:Int)=>x%3==0)
    divisibleByThreeFilter.foreach(x=>println(x))
    println(divisibleByThreeFilter)

    var divisibleByThreeFilter1 = listOfno.filter(x => x % 3 == 0)
    divisibleByThreeFilter1.foreach(x => println(x))
    println(divisibleByThreeFilter1)

    println("----Use with underscore ----")
    var divisibleByThreeFilter2 = listOfno.filter(_ % 3 == 0)
    divisibleByThreeFilter2.foreach(x => println(x))
    println(divisibleByThreeFilter2)
  }
}
