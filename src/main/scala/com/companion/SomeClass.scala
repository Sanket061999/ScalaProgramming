package com.companion

class SomeClass { 
  
  def printFilename() = { 
    println(SomeClass.HiddenFilename) 
  } } 

object SomeClass { 
  private val HiddenFilename = "/tmp/foo.bar" 
}
