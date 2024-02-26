package com.demo.Array

object LinearSearchExample2  extends App {
  def search(arr: Array[Int], x: Int): Int = {
    for (i <- arr.indices) {
      if (arr(i) == x) return i
    }
    -1 // return -1 if the element is not found
  }
  val array = Array(2, 4, 0, 1, 9)
val target = 1
val result = LinearSearchExample2.search(array, target)
if (result != -1) println(s"Element $target is present at index $result")
else println(s"Element $target is not present in the array")


}
