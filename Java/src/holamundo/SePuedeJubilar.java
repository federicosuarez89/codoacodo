package holamundo;

import java.util.Scanner;

/*
    Se puede jubilar si es hombre y tiene 65 o mas,o si es mujer y tiene 60 o mas
 */
public class SePuedeJubilar {
    public static void main(String[] args) {
        String genero;
        int edad;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el genero de la persona: ");
         genero = entrada.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        edad=entrada.nextInt();
        if (genero.equalsIgnoreCase("m")&& edad>=65) {
            System.out.println("Se puede jubilar");
        }   else if (genero.equalsIgnoreCase("f")&& edad>=60){
            System.out.println("Se puede jubilar");
            }
        else {
            System.out.println("No se puede jubilar");
            }


    }
}
