package com.string

object StringDemoA {
  def main(args: Array[String]): Unit = {
    var name:String="Sanket"
    println(name)

    //Any method used to get the information of an object called as accessor method
    //length() method
    val lenatr=name.length()
    println("length "+lenatr)
    println("length without using () "+name.length)


    //concat method
    var var1="Hello "
    var var2="World"
    println(var1+var2+"!")
    println("concat method "+var1.concat(var2))


    //equals method
    var val3="World"
    println("Equals method "+var2.equals(val3))
    println("First check var2 and var3 are not null and then compare the value " + var2==val3)

    //charAt
    println("charAt index 0 is "+var1.charAt(0))

    //isEmpty
    var1=""
    println("isEmpty funtion "+var1.isEmpty)
    //String formatting
    var nameOfCar="Mercedes"
    var costOfCar=500000
    var milageOfCar=8.5

    printf("Name of Car is %s and cost is %d and milages is %.2f \n",nameOfCar,costOfCar,milageOfCar)

    //Multiline string
    var multiLineString=
    """Hello
          World
    Good"""
    println(multiLineString)
    println("------")
    //Multiline string
    var multiLineString1 =
    """Hello
             |World
        |Good""".stripMargin  // for stripMargin | is needed
      println(multiLineString1)

    var multiLine11 =
    """Hello
            $World
        $Good
        """.stripMargin('$') // for stripMargin  is needed
      println(multiLine11)
//Use """ and | , $ and stripMargin function

//String Interpolation
//1. 's' String Interpolator
    var namePM="Modi"
    println("Hello "+namePM)  // not used so much
    println(s"Hello $namePM")  // s interpolar (widely used)

 //2 'f' Interpolator
    var sal=10000.12
    println(f"Name is $namePM and salary is $sal")
    println(f"Name is $namePM%s and salary is $sal%12.4f")

 //3 Row Interpolator
 //Same as s interpolator but does not perform escaping ,\n, \t
    println("Raw interpolator")
    println(f"Name is \n $namePM and salary is \t $sal")
    println(raw"Name is \n $namePM and salary \t is $sal")
    //Split Method
  }
}
