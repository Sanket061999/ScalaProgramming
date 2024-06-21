package com.string

object PatternMatchingDemo1 {
  def matchPattern1(x:Any)=x match{
    case 1 =>"One"
    case 2 => "Two"
    case "three"=>3
    case "four"=>4
    case _=>"None"
  }

  def main(args: Array[String]): Unit = {
    println(matchPattern1(1))
    println(matchPattern1("three"))
    println(matchPattern1(11))
  }}
