/*
    Hacer un arreglo que me permita la carga por teclado de 10 notas
    de clases,terminada la carga arrojara, las notas cargadas y el
    promedio de ellas.
 */
package ejercicios;

import java.util.Scanner;

public class ArrayPromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaNotas=0;
        double promedio;
        int misNotas[] = new int[4];
        for (int i = 0; i < misNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + " para calcular el promedio: ");
             misNotas[i] = entrada.nextInt();
        }
        for (int i = 0; i < misNotas.length; i++) {
            sumaNotas = sumaNotas + misNotas[i];
        }
        promedio = sumaNotas / misNotas.length;
        System.out.println("El promedio de las notas es: "+promedio);
    }
}
