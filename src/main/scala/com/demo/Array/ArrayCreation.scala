package com.demo.Array

object ArrayCreation extends App {
 var myList = Array[Integer](4,2,3,5,8,6)

 var myList2 =7 +: myList
 var j =0
 for(j <- myList2){
  println(j)
 }

 //traversing and printing the elements of array
 for(x <- myList) {
  println(x)
 }
  //counting the total no of elements in array without length function
  var count =0
  var i = 0
  while(i < myList.length) {
   i += 1
   count += 1
  }
  println("Length Of Array is :"+count)

  //finding the largest element in array
   var max = myList(0)
  for(i <- 0 to (myList.length-1)){
  

   if(myList(i) > max)
    max = myList(i)
  }
  println("Largest Element in Array :"+max)

  //sum of all elements in array
  var total =0
  for(i <-0 to myList.length-1){
   total += myList(i)
  }
  println("Sum of Element in array :"+total)

 val newList = myList.reverse
 for(x <- newList)
 println("Reverse List :"+x)




}
