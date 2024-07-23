package com.collections

object ListDemo2 {


  case class cars(val name:String,val cost:Int)


  def sortingLogic(c1: cars, c2: cars): Boolean = {
    println(c1.name + " " + c1.cost)
    println(c2.name + " " + c2.cost)
    c1.cost < c2.cost
  }


  def main(args: Array[String]): Unit = {

    val color:List[String]=List("Red","Greed","Yello")
    val color2=List("Red","Greed","Yello")

    val evenNo=List(2,4,6,8)
    val dobleNo=List(2.1,4.3,6.6,8.8)

    val list=List(2,1.1,"Hello") //List[Any]

    val matrix=List(  //List[List[Int]]
      List(1,2,3),
      List(1,2,3),
      List(1,2,4)
    )
    println(matrix)

    val matrix1=List(  //List[List[AnyVal]]
      List(1,2,3),
      List(1.1,2.2,3.3),
      List(1,2,4)
    )
    println(matrix)

//    val evenNo=List(2,4,6,8)
  println(evenNo(0))
  println(evenNo(1))
  println(evenNo(2))

    var evenNo1=Array(2,4,6,8)
    println(evenNo1(0))
    evenNo1(1)=40 //for array you can update the value
    println(evenNo1(1))

// You can create the list like this way as it is linked list
    val col="Green"::("Red"::("Black"::Nil))

    //way of defining list
    val num2=List(1,100)
    println(num2)

    val num3=List.range(1,20)
    println(num3)

    val num4 = List.range(1, 20,2)
    println(num4)

    val num5 = (1 to 20 by 2).toList
    println(num5)


    val num6= (1 to 20).toList
    println(num6)




    val num7=Nil
    println(num7)
    println(num7.isEmpty)
    println("====")


    //val color:List[String]=List("Red","Greed","Yello")
    println(color.head)  //only 1st element
    println(color.tail) // except 1st all get printed
    println(color.isEmpty) //check is empty
    println(color.size) //size
    println(color.length) //length
    println(color.mkString(", ")) // join by ,
    println(color.mkString("We are having this color ",  ", "  ," end of the list")) //adding prefix and postfix and ,


    println("Simple opration on list")
    //val color:List[String]=List("Red","Greed","Yello")


    //adding element at the end
    //color=color:+"blue" //making a new list but its a val therefore giving error
    var co=color:+"blue"
    println(co)

    //adding element at start
    var co1 = "blue" +: color
    println(co1)

    var co2 = "blue" :: color
    println(co2)


    //for distinct color
    val colors=color.distinct
    println(colors)

    println("=====================================")
    //printing element of the list
    //val color:List[String]=List("Red","Greed","Yello")
    for(col<-color){
      println(col)
    }
    println("---------------")
    color.foreach(x=>println(x))

    println("---------------")
    color.foreach(println(_))

    println("---------------")
    color.foreach(println)
    println("=====================================")

    //val evenNo=List(2,4,6,8)

    evenNo.foreach(x=>println(x*2))

    println("=====================================")

    //val color:List[String]=List("Red","Greed","Yello")

    //access 2nd index
    println(color(2))

    //getting color with length =3
    val colLen2=color.filter(i=>i.length==3)
    println(colLen2)

    val colLen3=color.filter(_.length==3)
    println(colLen3)


    val colLen33=color.filter(_.length>=3)
    println(colLen33)

      //only spedific color
    val colLen4 = color.filter(_== "Greed")
    println(colLen4)

    //specifi char inside the color

    val colLen5 = color.filter(_.contains("d"))
    println(colLen5)


    println("-------------------------------------")

    //exist
    val colExist = color.exists(x=>x=="Green")
    println(colExist)

    val colExist1 = color.exists(x => x == "Greed")
    println(colExist1)
    println("-------------------------------------")

   //fill method
   val filld=List.fill(5)("red")
    println(filld)

    val fillnum=List.fill(4)(2.4)
    println(fillnum)
    println("-------------------------------------")

    //tabulate method
    val tabdemo1=List.tabulate(5)(x=>x+10) //  x is index
    println(tabdemo1)

    val squredNum=List.tabulate(5)(x=>x*x) //  x is index
    println(squredNum)

    val muld = List.tabulate(3,3)((r,c) => r*c) //  r, c are index
    println(muld)

    val muld1 = List.tabulate(3, 3)(_ * _) //
    println(muld1)
    println("-------------------------------------")



    val num=List(1,2,3,4,5,6,31,24)
    println(num.reverse)
    println(num.sorted)
    println(num.sorted(Ordering.Int.reverse))
    println("--")
    println(num.sortBy(x=>2/x)) //sorting based on 2/x //used for multidimentional
    println(num.sortBy(x=>x).reverse) //used for multidimentional


    val car1=cars("Mercedes",1000)
    val car2=cars("BMW",2000)
    val car3=cars("Audi",3000)

    val listOfcars=List(car1,car2,car3)
    println(listOfcars)
    println(listOfcars.sortBy(c=>c.cost))
    println(listOfcars.sortBy(c=>c.cost).reverse)
    println(listOfcars.sortBy(c=>c.name))
    println(listOfcars.sortBy(c=>c.name).reverse)
    println("-------------------------------------")


    //val num=List(1,2,3,4,5,6,31,24)
    println(num.sortWith((x,y)=>x>y))
    println(num.sortWith((x,y)=>x>y).reverse)
    println(num.sortWith((x,y)=>x<y))
    println(num.sortWith((x,y)=>x<y).reverse)
    println("----")
    println(num.sortWith(_<_))

    println("----")

      //val listOfcars=List(car1,car2,car3)
//    val car1=cars("Mercedes",1000)
//    val car2=cars("BMW",2000)
//    val car3=cars("Audi",3000)

    println(listOfcars.sortWith(_.cost<_.cost))
    println(listOfcars.sortWith(_.cost<_.cost).reverse)


  //sorting with user defined funtion
    println(listOfcars.sortWith(sortingLogic))
    println(listOfcars.sortWith(sortingLogic).reverse)




//ListBuffer

import scala.collection.mutable.ListBuffer

    val numListBuffer=ListBuffer[Int]()
    println(numListBuffer)
    numListBuffer+=10
    numListBuffer+=11
    numListBuffer+=12
    println(numListBuffer)

    numListBuffer+=(13,14,15)
    println(numListBuffer)


    numListBuffer-=10
    println(numListBuffer)


    numListBuffer-=(13,14,15)
    println(numListBuffer)

    val numList=numListBuffer.toList
    println("Now its list not ListBuffer")

    println(numList.map(x=>x*x))






  }
}