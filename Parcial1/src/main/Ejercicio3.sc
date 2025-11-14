object Ejercicio3 {

  def generadorSaludo(fraseBase: String): String => String = {

    def saludo(nombre: String): String = {
      s"$fraseBase, $nombre!"
    }

    saludo
  }

  def main(args: Array[String]): Unit = {

    val generador = generadorSaludo("Hola")
    val mensaje = generador("Carlos")

    println(mensaje)
  }
}
