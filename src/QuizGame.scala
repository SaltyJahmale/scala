/**
  * Created by bogust on 21-4-16.
  */

trait Equal {
  def isEqual(x: Any, y: Any): String
}

class QuizGame extends Equal {

  val Greetings = "Hello welcome to the calculator game, " +
    "there gonna be 5 mathematical questions \n"
  val firstQ = "We begin with  \n"
  val repeatQ = "The next one is \n"
  val lastQ = "The next one is factorial of \n"
  val goodA = "Good job\n"

//  def isSimilar(x: Int, y:Int): String = {
//    if (x == y)
//      "matching numbers"
//    else
//      "no matching numbers"
//  }

  def randomTry(): Int = {
    val secondNumber = scala.util.Random
    secondNumber.nextInt(6) + 1
  }

  //Tuple example
  val t = ("1.", "2.", "3.", "4.", "5.")

  var points = 0

  def quiz(randomNumber: Int, randomNumber2: Int, iteration: Int = 0): Unit = {

    if (iteration == 0) {
      println(Greetings)
      print(t._1 + "The question gonna be " + randomNumber + " + " + randomNumber2 + "\n")
      if (add(randomNumber, randomNumber2) == readLine().toInt) {
        print(goodA)
        points = points + 1
        println(isEqual(randomNumber, randomNumber2))
      }
    } else if (iteration == 1) {
      println(t._2 + repeatQ + randomNumber + " - " + randomNumber2)

      if (subtract(randomNumber, randomNumber2) == readLine().toInt) {
        print(goodA)
        points = points + 1
        println(isEqual(randomNumber, randomNumber2))
      }

    } else if (iteration == 2) {
      println(t._3 + repeatQ + randomNumber + " * " + randomNumber2)

      if (multiply(randomNumber, randomNumber2) == readLine().toInt) {
        print(goodA)
        points = points + 1
        println(isEqual(randomNumber, randomNumber2))
      }

    } else if (iteration == 3) {
      println(t._4 + repeatQ + randomNumber + " * " + randomNumber2)

      if (multiply(randomNumber, randomNumber2) == readLine().toInt) {
        print(goodA)
        points = points + 1
        println(isEqual(randomNumber, randomNumber2))
      }

    } else if (iteration == 4) {
      println(t._5 + lastQ + randomNumber)

      if (factorial(randomNumber) == readLine().toInt) {
        print(goodA)
        points = points + 1
        println(isEqual(randomNumber, randomNumber2))
      }
      print("The points you have earned " + points + " out of the 5")
    } else {
      sys.exit()
    }
    quiz(randomTry(), randomTry(), iteration + 1)
  }

  //   multiply
  def multiply(x: Int, y: Int) = x * y

  //   add
  def add(x: Double, y: Double) = x + y

  //   subtract
  def subtract(x: Double, y: Double) = x - y

  //   Recursive function
  def factorial(x: Double): Double = {
    if (x <= 1)
      1
    else
      x * factorial(x - 1)
  }

  override def isEqual(x: Any, y: Any): String = {
    if (x == y)
      "matching numbers"
    else
      "no matching numbers"
  }
}