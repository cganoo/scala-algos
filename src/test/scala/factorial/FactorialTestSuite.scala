package factorial

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorialTestSuite extends FunSuite {
  import Factorial.factorialNTR

  test("factorialNTR: Factorial of 0 is 1") {
    assert(factorialNTR(0) === 1)
  }

  test("factorialNTR: Factorial of 1 is 1") {
    assert(factorialNTR(1) === 1)
  }

  test("factorialNTR: Factorial of 5 is 120") {
    assert(factorialNTR(5) === 120)
  }

  test("factorialNTR: Factorial of a negative number throws IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      factorialNTR(-3)
    }
  }
}
