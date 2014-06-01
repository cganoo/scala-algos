package lists

/**
 * Created by cganoo on 5/31/14.
 */
object Lists extends App {

  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new Error("last of empty list is undefined")
    case y :: Nil => y
    case y :: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case Nil => throw new Error("init of empty list is undefined")
    case List(y) => Nil
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case z :: zs => z :: concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil => xs
    case y :: ys => reverse(ys) ++ List(y)
  }

  def removeAt[T](n: Int, xs: List[T]): List[T] = (xs take n) ::: (xs drop n + 1)

  /**
   * Flattens the specified list by flattening any contained nested lists
   * Type erasure will cause abstract type to be unchecked in the type pattern used by the method
   * Hence using Any
   * @param xs the list to be flattened
   * @tparam Any
   * @return the flattened list devoid of any nested lists
   */
  def flatten[Any](xs: List[Any]): List[Any] = xs match {
    case Nil => xs
    case (y: List[Any]) :: ys => flatten(y) ::: flatten(ys)
    case _ => xs.head :: flatten(xs.tail)
  }

  val sampleList = List(1, -7, 9, List(9, 34, 9))
  println(last(sampleList))
  println(init(sampleList))
  println(reverse(sampleList))
  println(removeAt(1, sampleList))
  println(flatten(sampleList))

}
