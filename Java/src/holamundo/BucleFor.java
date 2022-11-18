package holamundo;

import java.util.Scanner;

/*
    Ingrese un numero para calcular el factorial
 */
public class BucleFor {
    public static void main(String[] args) {
        int numero=0;
        int factorial = 1;
        char salir='.';
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero: ");
            numero=entrada.nextInt();
            for (int i=1;i<=numero;i++){
                factorial*=i;
            }

            System.out.println("El factorial de: "+numero+" es: "+factorial);
            System.out.println("Desea salir? (s/n)");
            salir=entrada.next().charAt(0);

        }while (salir=='n');
        System.out.println("Programa finalizado");
    }
}
