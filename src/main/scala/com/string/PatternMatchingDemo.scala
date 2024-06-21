package com.string

object PatternMatchingDemo {
  def matchPattern(x:Int)=x match{
    case 1 =>"One"
    case 2 => "Two"
    case 3=>"Three"
    case _=>"None"
  }

  def main(args: Array[String]): Unit = {
    println(matchPattern(1))
    println(matchPattern(2))
    println(matchPattern(11))
  }}
