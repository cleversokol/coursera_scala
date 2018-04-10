//@tailrec
def factorial(x: Int): Int = {
  def factorialIter(y: Int, acc: Int): Int =
    if (y < 1) acc else factorialIter(y - 1, acc * y)

  factorialIter(x, 1)
}

factorial(4)