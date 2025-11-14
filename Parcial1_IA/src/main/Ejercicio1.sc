object Ejercicio1 extends App {

  // Aplica una transformación a cada número de la lista
  def transformar(lista: List[Int], regla: Int => Int): List[Int] = {
    lista.map(n => regla(n))
  }

  val numeros = List(1, 2, 3, 4, 5)

  // Ejemplo 1: multiplicar por 2
  val doblados = transformar(numeros, n => n * 2)
  println("Doblados: " + doblados)

  // Ejemplo 2: sumar 10
  val aumentados = transformar(numeros, n => n + 10)
  println("Aumentados: " + aumentados)
}
