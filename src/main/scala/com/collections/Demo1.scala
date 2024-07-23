package com.collections

object Demo1 {

  def main(args: Array[String]): Unit = {
    //Mutable
    val x=scala.collection.mutable.ArrayBuffer(2,4,6,8)
    println(x)
    x+=10
    println(x)
    
    //for var you can do this
    //x = x :+ 10
    println(x)

    println(x.map(i=>i+1)) // as its a val we can't define x=x.map(i=>i+1)
    // IF its a var we can change the value of collection
    println(x)

    //Immutable
    var y = scala.collection.immutable.List(2, 4, 6, 8)
    println(y)
    y=y.map(i=>i+10)
    println(y)

    //y += 10 //as its immutable //+= method is only defined in mutable class

    //IF still want to add the value then define the new varible
    println("Newly created variable")
    val z=y:+10
    println(z)

  }

}
