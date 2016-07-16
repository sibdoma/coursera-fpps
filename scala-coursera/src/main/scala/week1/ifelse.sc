def loop: Boolean = loop

def and(x: Boolean, y: => Boolean): Boolean =
  if (x) y else false
def or(x: Boolean, y: Boolean): Boolean =
  if (x) true else y

and(true, false)
or(true, false)
and(false, loop)
