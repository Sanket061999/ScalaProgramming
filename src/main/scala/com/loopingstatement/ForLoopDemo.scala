package com.loopingstatement

object ForLoopDemo {
  def main(args:Array[String]): Unit = {

    for(i <- 1 to 5){
      println(i)
    }

    println("======")

    for(j <- 1 until 5){
      println(j)

    }

println("========")
    for (i<- 1 to 3){
      for (j<- 1 until 4){
        print(i+""+j+' ')
      }
      println()
    }


    for(i<-1 to 5; j<-1 until 6){
      print(i+""+j+" ")
    }
println()

    for (i <- 1 to 3; j <- 1 until 4; k<-1 to 3) {
      print(i + "" + j + "" + k + " ")
    }
  }
}
