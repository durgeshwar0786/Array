package com.demo.Array
import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo2 extends App {

  var arrBuffer = ArrayBuffer[Integer]()

  arrBuffer += 4
  arrBuffer += 7
  arrBuffer += 3
  arrBuffer += 8
  arrBuffer += 1
  var i = 0
  for (i <- arrBuffer) {
    println("before adding :" + i)
  }
  arrBuffer += 9
  for (j <- arrBuffer) {
    println(" After adding new elements:" + j)
  }



}
