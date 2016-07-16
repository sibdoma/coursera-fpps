package udemy

object Demo extends App {
  B(0) +:+ B(1) :+: B(2)
}

case class B(value: Int) {
  def :+:(that: B): B = {
    print(this.value)
    that
  }
  def +:+(that: B): B = {
    print(this.value)
    that
  }
}
