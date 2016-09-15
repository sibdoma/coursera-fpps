package test

import java.io.InputStream

object Sort extends App {

  val start = System.nanoTime()
  val stream : InputStream = getClass.getResourceAsStream("/seq.txt")
  val numbers: List[Int] = io.Source.fromInputStream(stream).mkString.split(",").map(_.toInt).toList


  val sortNumbers = isort(numbers)
  val end = System.nanoTime()
  val result: Double = (end - start) / 1000000000.0
  println(s"Sort time: ${result}s")

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

}
