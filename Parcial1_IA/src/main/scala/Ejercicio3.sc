object Ejercicio3 extends App {

  // Antes era anónima: (fraseBase => (nombre => s"$fraseBase, $nombre!"))
  // Convertida a función con nombre
  def generadorSaludo(fraseBase: String): String => String = {
    (nombre: String) => s"$fraseBase, $nombre!"
  }

  val saludoFormal = generadorSaludo("Buenos días")
  println(saludoFormal("Estudiante"))

  val saludoAmigo = generadorSaludo("Qué tal")
  println(saludoAmigo("Profe"))
}
