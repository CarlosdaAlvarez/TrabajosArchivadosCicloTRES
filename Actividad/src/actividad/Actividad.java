package actividad;

import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
