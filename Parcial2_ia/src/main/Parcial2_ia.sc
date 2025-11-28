case class AutorInfo(autor: String, totalPaginas: Int, cantidadLibros: Int)

def autorMasProductivo(libros: List[Libro], minPag: Int, minAnio: Int): Option[AutorInfo] = {

  // Filtrar
  val filtrados =
    libros
      .filter(_.paginas > minPag)
      .filter(_.anio >= minAnio)

  if (filtrados.isEmpty) return None

  // Agrupar por autor y transformar cada grupo a AutorInfo (sin usar mapValues/view)
  val infoAutores: List[AutorInfo] =
    filtrados
      .groupBy(_.autor)                     // Map[String, List[Libro]]
      .map { case (autor, librosAutor) =>   // transformar cada par (autor, lista)
        AutorInfo(
          autor = autor,
          totalPaginas = librosAutor.map(_.paginas).sum,
          cantidadLibros = librosAutor.size
        )
      }
      .toList

  // Elegir el que tenga más páginas
  Some(infoAutores.maxBy(_.totalPaginas))
}
