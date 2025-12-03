object IntegracionSimpson {

  def main(args: Array[String]): Unit = {

    // Función principal implementa método de Simpson 1/3
    def integracion(f: Double => Double, a: Double, b: Double): Double = {
      val xAVG = (a + b) / 2.0
      (b - a) * (f(a) + 4 * f(xAVG) + f(b)) / 6.0
    }

    // Función para calcular el error absoluto
    def calculError(valorEsperado: Double, valorObtenido: Double): Double = {
      Math.abs(valorEsperado - valorObtenido)
    }

    println("=" * 70)
    println("MÉTODO DE SIMPSON 1/3 - INTEGRACIÓN NUMÉRICA")
    println("=" * 70)

    // 1. Integral: ∫₃⁵ (-x² + 8x - 12)dx
    val f1 = (x: Double) => -Math.pow(x, 2) + 8 * x - 12
    val resultado1 = integracion(f1, 3, 5)
    val esperado1 = 7.33
    val error1 = calculError(esperado1, resultado1)

    println("\n1. ∫₃⁵ (-x² + 8x - 12)dx")
    println(f"   Valor obtenido:  $resultado1%.6f")
    println(f"   Valor esperado:  $esperado1%.6f")
    println(f"   Error:           $error1%.6f")

    // 2. Integral: ∫₀² 3x²dx
    val f2 = (x: Double) => 3 * Math.pow(x, 2)
    val resultado2 = integracion(f2, 0, 2)
    val esperado2 = 8.0
    val error2 = calculError(esperado2, resultado2)

    println("\n2. ∫₀² 3x²dx")
    println(f"   Valor obtenido:  $resultado2%.6f")
    println(f"   Valor esperado:  $esperado2%.6f")
    println(f"   Error:           $error2%.6f")

    // 3. Integral: ∫₋₁¹ (x + 2x² - x³ + 5x⁴)dx
    val f3 = (x: Double) => x + 2 * Math.pow(x, 2) - Math.pow(x, 3) + 5 * Math.pow(x, 4)
    val resultado3 = integracion(f3, -1, 1)
    val esperado3 = 3.333
    val error3 = calculError(esperado3, resultado3)

    println("\n3. ∫₋₁¹ (x + 2x² - x³ + 5x⁴)dx")
    println(f"   Valor obtenido:  $resultado3%.6f")
    println(f"   Valor esperado:  $esperado3%.6f")
    println(f"   Error:           $error3%.6f")

    // 4. Integral: ∫₁² (2x + 1)/(x² + x)dx
    val f4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2) + x)
    val resultado4 = integracion(f4, 1, 2)
    val esperado4 = 1.09861
    val error4 = calculError(esperado4, resultado4)

    println("\n4. ∫₁² (2x + 1)/(x² + x)dx")
    println(f"   Valor obtenido:  $resultado4%.6f")
    println(f"   Valor esperado:  $esperado4%.6f")
    println(f"   Error:           $error4%.6f")

    // 5. Integral: ∫₀¹ eˣdx
    val f5 = (x: Double) => Math.exp(x)
    val resultado5 = integracion(f5, 0, 1)
    val esperado5 = 1.71828
    val error5 = calculError(esperado5, resultado5)

    println("\n5. ∫₀¹ eˣdx")
    println(f"   Valor obtenido:  $resultado5%.6f")
    println(f"   Valor esperado:  $esperado5%.6f")
    println(f"   Error:           $error5%.6f")

    // 6. Integral: ∫₂³ 1/(x - 1)dx
    val f6 = (x: Double) => 1 / (x - 1)
    val resultado6 = integracion(f6, 2, 3)
    val esperado6 = 0.828427
    val error6 = calculError(esperado6, resultado6)

    println("\n6. ∫₂³ 1/(x - 1)dx")
    println(f"   Valor obtenido:  $resultado6%.6f")
    println(f"   Valor esperado:  $esperado6%.6f")
    println(f"   Error:           $error6%.6f")

    // 7. Integral: ∫₀¹ 1/(1 + x²)dx
    val f7 = (x: Double) => 1 / (1 + Math.pow(x, 2))
    val resultado7 = integracion(f7, 0, 1)
    val esperado7 = 0.785398
    val error7 = calculError(esperado7, resultado7)

    println("\n7. ∫₀¹ 1/(1 + x²)dx")
    println(f"   Valor obtenido:  $resultado7%.6f")
    println(f"   Valor esperado:  $esperado7%.6f")
    println(f"   Error:           $error7%.6f")
  }
}