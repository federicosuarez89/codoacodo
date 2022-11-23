package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        String respuesta=" ";
        ArrayList <String> listaCompras = new ArrayList<String>();
        Scanner entradaRespuesta = new Scanner(System.in);
        Scanner entradaLista = new Scanner(System.in);
        System.out.println("********Lista de compras********");
        System.out.println("Ingrese el primer elemento de la lista: ");
        do {
            listaCompras.add(entradaLista.nextLine());
            System.out.println("Desea agregar otro elemento? (s/n)");
            respuesta=entradaRespuesta.nextLine();
            System.out.println("Agregue el siguiente item a comprar: ");
        }while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Tu lista de compras: ");
        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println(listaCompras.get(i));
        }
    }
}
