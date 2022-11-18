package holamundo;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int c=0;
        char salir;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println(c);
            c++;
            System.out.println("Desea salir? (s/n) ");
            salir = entrada.next().charAt(0);
        }while (salir=='n');
        System.out.println("Fin del bucle");

    }
}
