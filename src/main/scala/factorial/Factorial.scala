package factorial

/**
 * An object with methods to compute the factorial value of a number in various ways
 * Created by cganoo on 5/3/14.
 */
object Factorial extends App {

  /**
   * Computes factorial of a non-negative number in a recursive but non-tail-recursive fashion
   * @param n An integer whose factorial value is to be calculated
   * @return The factorial value of the specified integer
   * @throws IllegalArgumentException if specified integer is negative
   */
  def factorialNTR(n: Int): BigInt = {
    if(n < 0) throw new IllegalArgumentException("Factorial undefined for negative numbers")
    else if (n == 0 || n == 1) 1
    else n * factorialNTR(n - 1)
  }
}
