package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(balance("(just an) example".toList))
    println(balance("())(".toList))
    println(balance(":-)".toList))
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))

    println(countChange(4, List(1, 2)))

  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def check(chars: List[Char], count: Integer): Boolean = {
      if (chars.isEmpty) count == 0
      else if (chars.head == '(') check(chars.tail, count + 1)
      else if (chars.head == ')' && count > 0) check(chars.tail, count - 1)
      else if (chars.head == ')') false
      else check(chars.tail, count)
    }
    check(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else if (money > 0 && coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
