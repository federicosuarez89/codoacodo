/*
    Ejercicio: ingresar 10 numeros por teclado y calcular el promedio y mostrar
    el resultado
 */
package funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones2 {
    //Creamos la funcion que pide ingresar los numeros para promediar
    static int ingresaNumero(String mensaje){
        int numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println(mensaje);
        numero=entrada.nextInt();
        return numero;
    }
    public static void main(String[] args) {
        int suma=0;
        double promedio;
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int numero=ingresaNumero((i+1)+".Ingrese un numero por favor: ");
            numeros.add(numero);
            suma=suma+numeros.get(i);
        }
        //Mostramos los numeros ingresados
        System.out.println("Los numeros ingresados son: "+numeros);
        //Calculamos el promedio de los numeros ingresados
        promedio=suma/numeros.size();
        //Imprimimos el resultado
        System.out.println("El promedio de los numeros ingresados es: "+
                promedio);
    }
}
