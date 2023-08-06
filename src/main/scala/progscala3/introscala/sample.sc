val str = Seq("STILL", "MORE", "HELLO", "WORLD")
  .map(_.toLowerCase)
  .mkString("[", ",","]")

val seq: Seq[String] = Seq("This", "is", "Scala")
val array: Array[String] = Array("This", "is", "an", "array")
println(seq)
println(array.mkString("Array(", ", ", ")"))