val x = new Rational(1, 3)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
x.numer
x.denom

x.sub(y).sub(z)
y add y
x.less(y)
z.max(y)

class Rational(x: Int, y: Int) {
  require(y != 0, "denom must be nonzero")
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)



  val numer = x

  val denom = y

  def neg: Rational =
    new Rational(-numer, denom)

  def add(that: Rational) =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def mul(that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)

  def less(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this.less(that)) that else this

  override def toString() = {
    val g = gcd(x, y)
    numer / g + "/" + denom / g
  }
}