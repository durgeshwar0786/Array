package com.demo.Array

object LinearSearchExample  extends App {
  var arr = Array(9, 4, 6, 7, 8)
  var i = 0
  var element = 7
  var temp =0
  for (i <- 0 to (arr.length - 1) ) {
    if (arr(i) == element) {
      temp = i
      println("Element is found  at index :" + temp)
    }
  }

}










