package com.implicita


implicit class StringFunctionClass(s: String) {
  def firstChar() = s.substring(0, 1)

}

object Demo {
  def main(args: Array[String]): Unit = {
   val strr="Hello World"
    println(strr.toUpperCase)
    println(strr.firstChar())
    //it will first check in String class then
    // it will check all the implicit class do we have fitstChar() function
  }
}
