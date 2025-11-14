object Ejercicio2 extends App {

  def transformCalific(calificaciones: List[Double], politica: Double => Double): List[Double] = {
    calificaciones.map(c => politica(c))
  }

  val notas = List(8.5, 7.4, 9, 5, 10)

  val redondeada = transformCalific(notas, c => math.round(c).toDouble)
  println("Redondeadas: " + redondeada)

  val bonificada = transformCalific(notas, c => c + 0.5)
  println("Bonificadas: " + bonificada)

  val ajustada = transformCalific(notas, c => {
    if (c > 9.0) c - 0.3 else c
  })
  println("Ajustadas: " + ajustada)
}
