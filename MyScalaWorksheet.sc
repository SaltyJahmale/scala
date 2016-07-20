
//function add
def addThis(a:Int, b:Int) : Int = {
  var sum:Int = 0;
  sum = a + b;
  return sum;
}
addThis(6, 4)



for(i <- 1 to 5)
  println("this is a recusief function" + factorial(i))

//recursion
def factorial(n:BigInt): BigInt = {
  if(n <= 1)
    1
  else
    n * factorial(n - 1)
}


def multiply(x: Double, y: Double) = x * y

multiply(5, 2)


case class Sample(firstQuestion: String, secondQuestion: String, thirdQuestion:
String, fourthQuestion: String, fifthQuestion: String)

print(Sample)


val asd = List(1,5,2)
val dsa = List(2,5,1)





//tuples
val t = (1, 2, 3, 4)

val sum = t._1 + t._2 + t._3


def swap[A](l: List[A], x: Int) = {
  val (l1,rest) = l.splitAt(x)
  val (l2,l3) = rest.splitAt(rest.length-x)
  l3 ::: l2 ::: l1
}

