def myMethod(datos: List[Double]): Double = {
  val suma = datos.sum
  val promedio = suma / datos.size

  val sumaCuadrados = datos.map(d => {
    val diferencia = d - promedio
    diferencia * diferencia
  }).sum

  math.sqrt(sumaCuadrados / datos.size)
}

