package lists

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created by cganoo on 5/31/14.
 */
@RunWith(classOf[JUnitRunner])
class ListsSuite extends FunSuite {
  import Lists._

  trait TestLists {
    val t1 = List(1, -7, 9, List(9, 34, 9))
    val t2 = List()
    val t3 = List(List(1, 2), List(3, 4, 5), List(6))
    val t4 = List('a', 'b', 'c')
    val t5 = List(List(9, 34, 9), 9, -7, 1)
  }

  test("Fetch last and initial part of the list correctly") {
    new TestLists {
      assert(last(t1) === List(9, 34, 9))
      intercept[Error] {
        last(t2)
      }
      assert(last(t3) === List(6))
      assert(last(t4) === 'c')
      assert(init(t1) === List(1, -7, 9))
      assert(init(t3) === List(List(1, 2), List(3, 4, 5)))
      intercept[Error] {
        init(t2)
      }
    }
  }

  test("Concatenation of 2 lists") {
    new TestLists {
      assert(concat(t1, t2) === t1)
      assert(concat(t2, t2) === Nil)
      assert(concat(t3, t4) === List(List(1, 2), List(3, 4, 5), List(6), 'a', 'b', 'c'))
    }
  }

  test("Reversal of a list") {
    new TestLists {
      assert(reverse(t1) === t5)
      assert(reverse(t2) === Nil)
    }
  }

  test("Removal of an element at a specified position in a list") {
    new TestLists {
      assert(removeAt(3, t1) === List(1, -7, 9))
      assert(removeAt(-1, t1) === t1)
      assert(removeAt(10, t1) === t1)
      assert(removeAt(0, t2) === Nil)
      assert(removeAt(100, t2) === Nil)
      assert(removeAt(1, t5) === List(List(9, 34, 9), -7, 1))
    }
  }

  test("Flattening of a list") {
    new TestLists {
      assert(flatten(t1) === List(1, -7, 9, 9, 34, 9))
      assert(flatten(t2) === Nil)
      assert(flatten(List(List(List(), List()))) === Nil)
      assert(flatten(t3) === List(1, 2, 3, 4, 5,6))
    }
  }

}
