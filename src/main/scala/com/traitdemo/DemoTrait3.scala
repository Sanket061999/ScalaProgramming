package com.traitdemo

abstract class Vehicled {
}

trait Vehicled1 {
  }

trait Card {
  //if any programmer want to import this and if you want he should mandatorily import the above
  //class and trait and explicitly mentioned then you have to write the folling line
  this: Vehicled1 with Vehicled=>{
    //so programmer must need to import vehicled1 trait and vehicled abstract class and
    //mention explicitly
  }

  }

class Marutid extends Vehicled with Vehicled1 with Card {
  }

object DemoTraitd2 {
  def main(args: Array[String]): Unit = {
  val m1= new Marutid
  println("sAnke")
  }
}
