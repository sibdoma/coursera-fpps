package funsets

object Main extends App {

  import FunSets._

  println(contains(singletonSet(1), 1))
  println(forall(_ > 10, _ > 1))
  println(exists(_ > 10, _ < 10))
  printSet(map((x: Int) => x == 1 || x == 3|| x== 4 || x==5 || x==7 || x ==1000, x => x - 1))
}
