package com.demo.Array

object StringDemoPalindrome extends App {

  val str = "madam"
  var revString = ""

  for (i <- str.length - 1 to 0 by -1) {
    revString += str.charAt(i)
  }

  println("Reverse String :" + revString)

  if (revString.equals(str)){
    println("String is palindrome")
  }
  else {
    println("Not Palindrome")
  }


}
