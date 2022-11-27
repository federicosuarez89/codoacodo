package persistenciaDeDatos;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    //Definimos el procedimiento para tratar excepciones y guardar los datos de las variables
    //en un archivo en la Pc del usuario
    static void escribirArchivo(ArrayList<String>lista){
        FileWriter archivo=null;
        String rutaArchivo= "C:\\Users\\feder\\Desktop\\Federico\\CodoaCodo Java\\codoacodo\\PersistenciaDeDatos\\listaDeCompras.txt";

        try {
            archivo=new FileWriter(rutaArchivo);
            //Escribimos linea a linea en el archivo
            for (String item:lista) {
                archivo.write(item+"\n");
            }
            System.out.println("Se escribieron los datos");
            archivo.close();
        }catch (Exception error){
            System.out.println("Mensaje de la excepcion: "+error.getMessage());
        }
    }

    //Definimos el procedimiento para tratar excepciones y leer los datos almacenados
    //en un archivo de texto almacenado en la Pc del usuario
    static void leerArchivo(){
        //Archivo que queremos leer
        String rutaArchivo="C:\\Users\\feder\\Desktop\\Federico\\CodoaCodo Java\\codoacodo\\PersistenciaDeDatos\\listaDeCompra.txt";
        File archivo=new File(rutaArchivo);
        Scanner contenidoArchivo=null;
        try {
            //Leemos el contenido del archivo
            System.out.println("*****Leemos el contenido del archivo*****");
            contenidoArchivo=new Scanner(archivo);
            //Leemos cada linea de texto
            while (contenidoArchivo.hasNextLine()){
                //Guardamos la linea en un String
                String linea=contenidoArchivo.nextLine();
                //Imprimimos cada linea
                System.out.println(linea);
            }
            contenidoArchivo.close();
        }
        //Si hay error se ejecuta este codigo
        catch (Exception errorContenido){
            System.out.println("Mensaje de la excepcion: "+errorContenido.getMessage());
        }
    }


    public static void main(String[] args) {
        ArrayList<String>listaCompras=new ArrayList<String>();

        //Añadimos con codigo duro los elementos de la lista
        listaCompras.add("pan");
        listaCompras.add("leche");
        listaCompras.add("cereales");
        listaCompras.add("shampoo");
        listaCompras.add("crema dental");
        listaCompras.add("fideos");
        listaCompras.add("Cerveza");
        listaCompras.add("Coca Cola");

        System.out.println(listaCompras);
        escribirArchivo(listaCompras);
        leerArchivo();

    }


}
