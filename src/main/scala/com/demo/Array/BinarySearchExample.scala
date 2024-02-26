package com.demo.Array

object BinarySearchExample {

    def binarySearch(arr: Array[Int],
                              Element_to_Search: Int): Int = {

      // Creating start variable to
      // point to the first value
      var low = 0

      // Creating end variable to
      // point to the last value
      var high = arr.length - 1

      // Finding the value in the
      // array iteratively
      while (low <= high) {

        // Getting middle element
        var middle = low + (high - low) / 2

        // If element found in the middle index
        if (arr(middle) == Element_to_Search)
          return middle

        else if (arr(middle) > Element_to_Search)
          high = middle - 1
        else
          low = middle + 1
      }

      // If value not found in the
      // entire array , return -1
      -1
    }

    // Creating main function
    def main(args: Array[String]) {


      var index = binarySearch(Array(1, 2, 3, 4, 55,
        65, 75), 65);

      // If value not found
      if (index == -1)
        print("Not Found")


      else
        print("Element found at Index " + index)
    }
  }
