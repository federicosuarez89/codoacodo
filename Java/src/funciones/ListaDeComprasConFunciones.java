/*
    Creamos una lista de compras
 */
package funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeComprasConFunciones {

    //Creamos procedimiento para agregar items a la lista
    static void agregarItem(ArrayList<String> lista){
        String nuevoItem=ingresarTexto("Agregue su elemento a la lista de compras");
        int resultadoBusqueda=buscarItem(nuevoItem,lista);
        if (resultadoBusqueda>=0){
            System.out.println("Este item ya existe en la lista");
            verLista(lista);
        }else {
            lista.add(nuevoItem);
            verLista(lista);
        }
    }

    //Creamos funcion para ingresar un mensaje antes de ingresar un item
    static String ingresarTexto(String mensaje){
        String texto;
        Scanner entradaTexto=new Scanner(System.in);
        System.out.println(mensaje);
        texto=entradaTexto.nextLine();
        return texto;
    }

    //Procedimiento para imprimir el ArrayList
    static void verLista(ArrayList<String>lista){
        System.out.println("Su lista tiene los siguientes elementos: "+lista);
    }

    //Procedimiento para eliminar items de la lista
    static void eliminarItem(ArrayList<String>lista){
        String elementoEliminar;
        verLista(lista);
        elementoEliminar=ingresarTexto("Cual de los elementos desea borrar?");
        if (buscarItem(elementoEliminar,lista)==-1){
            System.out.println("El item no existe");
        }else {
            lista.remove(lista.indexOf(elementoEliminar));
            System.out.println("El item indicado se elimino correctamente");
            verLista(lista);
        }

    }

    //Funcion para buscar el item en la lista
    static int buscarItem(String item,ArrayList<String>lista){
        //Traemos el indice del elemento o -1
        int indiceItem=lista.indexOf(item);
        int valorRetorno;

        //Vemos si la lista esta vacia,si encuentra el item o si no lo encuentra
        if (lista.isEmpty()){
            //si la lista esta vacia devuelve un cero
            valorRetorno=-2;
        }else {
            valorRetorno=indiceItem;
        }
        return valorRetorno;
        //devuelve 1 si lo encontro o -1 si no lo encontro y cero si la lista esta vacia
    }

    static void modificarItem(ArrayList<String>lista){
        String elementoModificar,nuevoValor;
        verLista(lista);
        elementoModificar=ingresarTexto("Cual elemento quiere modificar?");
        if (buscarItem(elementoModificar,lista)==-1){
            System.out.println("El elemento ingresado no existe");
        }else {
            nuevoValor=ingresarTexto("Nuevo valor del elemento:");
            lista.set(lista.indexOf(elementoModificar), nuevoValor);
            verLista(lista);
        }
    }



    public static void main(String[] args) {
        int opcionUsuario;
        char opcionSalir;

        //Definimos ArrayList donde se almacenan los items a comprar
        ArrayList <String> listaCompras = new ArrayList<String>();

        //Creamos una variable objeto para recibir por teclado los items
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoSalir=new Scanner(System.in);

        //Imprimimos menu visual de la lista de compras
       do {
           System.out.println("********Lista de compras********");
           System.out.println("Elija una opcion: ");
           System.out.println("1.Agregar elemento\n2.Eliminar elemento\n3.Modificar elemento\n4.Ver Lista");
           System.out.println("********************************************");
           opcionUsuario= teclado.nextInt();
           switch (opcionUsuario){
               case 1:
                   agregarItem(listaCompras);
                   break;
               case 2:
                   eliminarItem(listaCompras);
                   break;
               case 3:
                   modificarItem(listaCompras);
                   break;
               case 4:
                   verLista(listaCompras);
                   break;
               default:
           }
           System.out.println("Desea salir?  (s/n)");
           opcionSalir=teclado.next().charAt(0);
       }while (opcionSalir=='n');
        System.out.println("*************FIN DEL PROGRAMA************");
    }

}
