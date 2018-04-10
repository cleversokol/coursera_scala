def sqrt(x: Double): Double = {

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double): Boolean = {
    val delta = 0.001
    abs(guess * guess - x) / x < delta
  }

  def improve(guess: Double, x: Double): Double =
    (guess + x / guess) / 2

  def abs(x: Double) = if (x < 0) -x else x

  sqrtIter(1, x)

}
sqrt(2)
sqrt(0.001)
sqrt(1e-6)
sqrt(1e20)
