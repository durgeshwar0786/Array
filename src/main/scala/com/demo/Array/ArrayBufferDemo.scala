package com.demo.Array
import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo  extends App {
var arrBuffer =  ArrayBuffer[Integer]()

  arrBuffer += 1
  arrBuffer += 2
  arrBuffer += 3
  arrBuffer += 4
  arrBuffer += 5
  var i = 0
  for (i <- arrBuffer) {
    println("before adding :" + i)
  }
    arrBuffer += 6
   for(j<- arrBuffer){
     println(" After adding new elements:"+j)
  }

}
