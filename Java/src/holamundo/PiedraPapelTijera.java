package holamundo;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        int opcionUsuario, opcionPc = (int) (Math.random() * 3) + 1;
        char salir;
        System.out.println(opcionPc);
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Elija una opcion: \n1.Piedra\n2.Papel\n3.Tijera");
            opcionUsuario = entrada.nextInt();
            if (opcionUsuario == opcionPc) {
                System.out.println("Empate");
            } else {
                switch (opcionUsuario) {
                    case 1: //Piedra
                        if (opcionPc == 2) { //Papel
                            System.out.println("Computadora: Papel");
                            System.out.println("Usuario: Piedra");
                            System.out.println("Gano PC");
                        } else {  //opcionPc=3 Tijera
                            System.out.println("Computadora: Tijera");
                            System.out.println("Usuario: Piedra");
                            System.out.println("Ganaste");
                        }
                        break;
                    case 2: //Papel
                        if (opcionPc == 3) { //Tijera
                            System.out.println("Computadora: Tijera");
                            System.out.println("Usuario: Papel");
                            System.out.println("Gano PC");
                        } else {  //opcionPc=1 Piedra
                            System.out.println("Computadora: Piedra");
                            System.out.println("Usuario: Papel");
                            System.out.println("Ganaste");
                        }
                        break;
                    case 3: //Tijera
                        if (opcionPc == 1) { //Tijera
                            System.out.println("Computadora: Piedra");
                            System.out.println("Usuario: Tijera");
                            System.out.println("Gano PC");
                        } else {  //opcionPc=1 Piedra
                            System.out.println("Computadora: Papel");
                            System.out.println("Usuario: Tijera");
                            System.out.println("Ganaste");
                        }
                        break;
                }
            }
            System.out.println("Desea salir? (s/n)");
            salir = entrada.next().charAt(0);
        }while(salir=='n');
        System.out.println("Fin del programa");
    }
}
