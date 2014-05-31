package sum

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumSuite extends FunSuite {
  import Sum._

  test("Sum of numbers from 1 to 5 is 15") {
    assert(sumNTR(x => x, 1, 5) === 15)
    assert(sumTR(x => x, 1, 5) === 15)
  }

  test("Sum of squares of numbers from 1 to 3 is 14") {
    assert(sumNTR(x => x * x, 1, 3) === 14)
    assert(sumTR(x => x * x, 1, 3) === 14)
  }

}
