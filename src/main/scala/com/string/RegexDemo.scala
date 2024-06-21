package com.string

import scala.util.matching.Regex
object RegexDemo {
  def main(args: Array[String]): Unit = {
    val str1="Hello Hi 1 My 11 name is  12 Sanket , 0  Hello Hi hello"
    var pattern=new Regex("Hello")
    println(pattern findFirstIn str1)
    println((pattern findAllIn  str1).mkString(" - "))

    var patterna = "Hi".r
    println(patterna findFirstIn str1)
    println((patterna findAllIn str1).mkString(" - "))

    val patternb="[0-9]+".r  //+ = one or more
    println((patternb findAllIn str1).mkString(", "))

    val patternc = "(H|h)ello".r
    println((patternc findAllIn str1).mkString(", "))
    val stringToFind="Hello Hi 1 My 11 name is  12 Sanket , 0  Hello Hi hello"
    //Using Regular epression with getOrElse Function
    val patternaa="Hellooo".r
    println(patternaa findFirstIn stringToFind)  //None
    println(patternaa findFirstIn stringToFind getOrElse("No Match Found")) //No Match Found
    val patternbb="Sanket".r
    println(patternaa findFirstIn stringToFind getOrElse("No Match Found"))

    val patterncc="(H|h)ello".r
    println(patterncc findAllIn stringToFind foreach(d=>print("-"+d+"=>")))


  }
}