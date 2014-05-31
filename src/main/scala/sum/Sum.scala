package sum

import scala.annotation.tailrec

/**
 * Created by cganoo on 5/4/14.
 */
object Sum extends App {

  def sumTR(f: Int => Int, a: Int, b: Int): Int = {
    @tailrec
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  def sumNTR(f: Int => Int, a:Int, b:Int): Int = {
    if(a > b) 0
    else f(a) + sumNTR(f, a + 1, b)
  }

}
