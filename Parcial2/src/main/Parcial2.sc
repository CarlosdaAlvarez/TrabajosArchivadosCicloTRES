case class Libro(titulo: String, autor: String, paginas: Int, anio: Int)
case class AutorInfo(autor: String, totalPaginas: Int, cantidadLibros: Int)

def autorProductivo(libros: List[Libro], minPag: Int, minAnio: Int): Option[AutorInfo] = {

  val filtrados = libros
    .filter(_.paginas > minPag)
    .filter(_.anio >= minAnio)

  if (filtrados.isEmpty)
    return None

  var autoresUnicos: List[String] = List()
  for (lib <- filtrados) {
    if (!autoresUnicos.contains(lib.autor)) {
      autoresUnicos = autoresUnicos :+ lib.autor
    }
  }

  var listaInfos: List[AutorInfo] = List()

  for (autor <- autoresUnicos) {
    val librosAutor = filtrados.filter(_.autor == autor)

    var total = 0
    var cantidad = 0

    for (lib <- librosAutor) {
      total = total + lib.paginas
      cantidad = cantidad + 1
    }

    listaInfos = listaInfos :+ AutorInfo(autor, total, cantidad)
  }

  var mejor = listaInfos.head
  for (info <- listaInfos.tail) {
    if (info.totalPaginas > mejor.totalPaginas) {
      mejor = info
    }
  }

  Some(mejor)
}
