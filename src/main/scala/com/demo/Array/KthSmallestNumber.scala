package com.demo.Array

object KthSmallestNumber extends App {
  //sort in ascending order
  var arr = Array(4, 9, 7, 19, 21)
  var k = 3
  var i = 0
  for (i <- 0 until arr.length - 1 by (+1)) {
    var j = 0
    for (j <- i + 1 until arr.length by (+1)) {
      if (arr(i) > arr(j)) {

        var temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp

      }
    }
    if (i == k - 1) {
      println( s"${k}th smallest element in array is :" + arr(i))
    }
  }



}
