package com.string

import scala.util.matching.Regex

object RegexDemoAdvance {
  def main(args: Array[String]): Unit = {
    val stringToFind="Hello i am Able to do it, abl11 able able0"
    val patterna ="abl[ae]\\d+".r  //  \\d=digit    +: 1 or more [ae]= a or e compulsary
    println((patterna findAllIn stringToFind).mkString(","))

    val patternb = "abl[ae]\\d*".r //  \\d=digit    *: 0 or more [ae]= a or e compulsary, able is compulsary
    println((patternb findAllIn stringToFind).mkString(","))

    val patternc = "[Aa]bl[ae]\\d*".r //  \\d=digit    *: 0 or more [Aa]= a or A is compulsary
    println((patternc findAllIn stringToFind).mkString(","))

    val patternd = "(-)?(\\d+)(\\.\\d*)?".r  //first char is either "-" or nothing  //1 or more digit
                                            // \\. : decimal point    \\d* : 0 or more no  ? for optional
                                            // single \ is escape character
                                            // """ 3 inverted " is used to ignore the / special meaning of /
                                            //"""(-)?(\d+)(\.\d*)?""".r
    val stringToFindd="-1.5 divide by 5 is 3 is wrong"
    println((patternd findAllIn stringToFindd).mkString(","))
//    for(Decimal(signa, interpart, decimapart) <- Decimal findAllIn stringToFindd)
//      {
//        println(signa,interpart,decimapart)
//      }



    val Decimal="""(-)?(\d+)(\.\d*)?""".r
    val Decimal(sign, intergerpart,decimalpart)="-1.23"
    println(sign+" == "+intergerpart+" == "+decimalpart)


  }
}