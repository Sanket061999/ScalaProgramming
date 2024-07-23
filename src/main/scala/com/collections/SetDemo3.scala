package com.collections

object SetDemo3 {
  def main(args: Array[String]): Unit = {
    var s = Set("Sanket", "Shiwam", "Aniket")
    println(s)

    //for empty set
    var sempty: Set[String] = Set()
    println(sempty)

    //
    println(s.getClass)
    println(sempty.getClass)


    //If you have more than 4 element then it become HashSet
    var ss = Set("Sanket", "Shiwam", "Aniket", "sdfl", "asdf", "123")
    println(ss.getClass)

    //for mutable set
    var mutset = scala.collection.mutable.Set("India", "USA", "Singapore", "UK", "Pak")
    println(mutset.getClass)

    //adding element
    mutset += "Aus"
    println(mutset)
    println("---------------------------------------")


    var countries = scala.collection.immutable.Set("India", "USA", "Singapore", "UK", "Pak")
    println(countries.head) //1st element
    println(countries.tail) //except 1st element
    println(countries.isEmpty) //check isEmpty

    var developedcountries = scala.collection.immutable.Set("USA", "Singapore")
    var developingcountries = scala.collection.immutable.Set("India", "Malaysia")

    //joining 2 collection
    var allcounties = developedcountries ++ developingcountries
    var allcounties1 = developedcountries.++(developingcountries)
    println(allcounties)
    println(allcounties1)
    println("---------------------------------------")
    println(allcounties.min) //best use with number
    println(allcounties.max)

    println("---------------------------------------")

    val num1 = Set(1, 2, 3, 4, 5)
    val num2 = Set(3, 3, 3, 4, 5, 6, 7)
    print(num1, num2)

    //intersection
    println(num1 & num2)
    println(num1.&(num2))
    println(num1.intersect(num2))
    println(num1 intersect num2)

    //union
    println(num1 union num2)
    println(num1 ++ num2)
    println("----------------------------------------")

    val num11 = scala.collection.mutable.Set(1, 2, 3, 4, 5)
    println(num11)
    //adding element
    num11 += 10
    num11 += (11, 12)
    println(num11)

    num11 -= 10
    num11 -= (11, 12)
    println(num11)


    //to get its added newly
    println("adding ")
    println(num11 add 1) // false if already present
    println(num11 add 11) //true if not present and added newly
    println(num11)
    println("removing")
    println(num11 remove 11) //true if removed
    println(num11 remove 11) //false if not present


    println("-----")


    val num22 = scala.collection.mutable.Set(3, 3, 3, 4, 5, 6, 7)
    println(num22.contains(3)) // if present true
    println(num22.contains(33))

    println(num22.toArray) //converted to array


    //Sorted Set keeps the data in ascending order
    val sortedSet = scala.collection.SortedSet(11, 1, 111, 2, 3, 333, 4, 45)
    println(sortedSet)

    //LinkHashSet = sequence is preserved
    val linkhashset = scala.collection.mutable.LinkedHashSet(1, 2, 2, 33, 4, 55, 6)
    println(linkhashset)


    //Queue FIFO
    val queue = scala.collection.mutable.Queue(1, 22, 334, 555)
    println(queue)

    queue += 1111
    println(queue)

    queue += 2222
    println(queue)


    println("===----")
    println(queue.dequeue)
    println(queue.dequeue)
    println(queue)
    println("====----")

    //println(queue.dequeueFirst(x => x % 3 == 0))

    println(queue.dequeueFirst(_ % 3 == 0))
    println(queue)

    println(queue.dequeueAll(x=>x%1==0))
    println(queue)

  }

}