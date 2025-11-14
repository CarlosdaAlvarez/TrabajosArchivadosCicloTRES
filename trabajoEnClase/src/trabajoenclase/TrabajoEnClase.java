/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class TrabajoEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner datos = new Scanner(System.in);
           System.out.println("Cuantos datos va a ingresar?");
           int max = datos.nextInt();
           int suma = 0;
           int[] tdatos = new int[max]; // max-1 porque el arreglo empieza de cero
           for (int i = 0; i < max; i++) {
            System.out.println("Ingrese Un dato... ");
            int newDato = datos.nextInt();
            suma = suma + newDato;
            tdatos[i] = newDato;
        }
           double prom = suma/max;
           int menores= 0;
           int mayores= 0;
           int iguales = 0;
           for (int i = 0; i < max; i++) {
               if(tdatos[i]<prom){
                   menores = menores+1;
               }else if (tdatos[i]>prom){
                   mayores = mayores+1;
               } else if (tdatos[i]==prom){
                   iguales = iguales+1;
               }
               
        }
           System.out.println("Numeros Menores Al Promedio");
               System.out.println(menores);
               System.out.println("Numeros Mayores Al Promedio");
               System.out.println(mayores);
               System.out.println("Numeros iguales  Al Promedio");
               System.out.println(iguales);
           
           

    }
    
}
