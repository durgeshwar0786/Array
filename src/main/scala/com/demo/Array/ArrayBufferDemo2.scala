package com.demo.Array
import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo2 extends App {
  var arrBuffer = ArrayBuffer[Integer]()

  arrBuffer += 9
  arrBuffer += 7
  arrBuffer += 3
  arrBuffer += 6
  arrBuffer += 5
  var i = 0
  for (i <- arrBuffer) {
    println("before adding :" + i)
  }
  arrBuffer += 20
  for (j <- arrBuffer) {
    println(" After adding new elements:" + j)
  }

}
