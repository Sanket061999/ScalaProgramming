package com.advacefuntion

object FuntionWithVariableArgumentDemo3{
//Note 1 : Variable no. of argument should at the end
// NOte 2: You can not have more than 1, i.e. only once
  def printMultipleTime(x:Int,args:String*)={
    for(arg<-args){
      println(arg*x)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTime(2,"Sanket","Shiwam", "Aniket")
  }

}
