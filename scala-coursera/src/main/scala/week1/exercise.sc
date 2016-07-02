object exercise {
  def factorial(n: Integer) = {
    def loop(acc: Integer, n: Integer): Integer = {
      if (n == 0) acc
      else loop(acc * n, n - 1)
    }

    loop(1, n)
  }

  factorial(4)

}