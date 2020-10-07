// src/script/scala/progscala3/objectsystem/overrides/TraitDefInitVal.scala

trait AbstractT3:
  println("In AbstractT3:")
  val value: Int
  def inverse = 1.0/value

val obj3 = new AbstractT3:
  println("In obj3:")
  val value = 10

println("obj3.value = "+obj3.value+", inverse = "+obj3.inverse)
assert(obj3.value   == 10)
assert(obj3.inverse == 0.1)
