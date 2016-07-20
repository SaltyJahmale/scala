/**
  * Created by bogust on 21-4-16.
  */
object Main {
  def main(args: Array[String]) {
    new QuizGame quiz(RNG(), RNG())
  }

  def RNG() = {
    val secondNumber = scala.util.Random
    secondNumber.nextInt(6) + 1
  }

}
