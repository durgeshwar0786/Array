package com.demo.Array

object FindMinimumNumberInArray  extends App {

  var newArray = Array(6,4,7,3,8,9,1)
  var i =0
  var min = newArray(0)
  for(i <- 0 to (newArray.length-1)) {
    if(newArray(i) < min)
      min = newArray(i)
  }
  println("Smallest Number In Array is :"+min)
}
