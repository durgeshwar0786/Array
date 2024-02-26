package com.demo.Array

object duplicateWordsExample extends App {

  def findDuplicateWords(input: String): List[String] = {
    val words = input.toLowerCase.split("\\s+").toList
    val wordCountMap = words.groupBy(identity).mapValues(_.size)
    wordCountMap.filter(_._2 > 1).keys.toList
  }


  val inputString = "This is a sample string with duplicate words. This string has duplicate words."
  val duplicateWords = findDuplicateWords(inputString)
  if (duplicateWords.nonEmpty) {
    println("Duplicate words found:")
    duplicateWords.foreach(println)
  } else {
    println("No duplicate words found.")
  }

}
