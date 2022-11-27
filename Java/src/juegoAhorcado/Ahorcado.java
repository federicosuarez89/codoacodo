package juegoAhorcado;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {
    //Definimos la funcion para tratar excepciones y leer los datos almacenados
    //en un archivo de texto almacenado en la Pc del usuario
    static String seleccionarPalabra(){
        //Archivo que queremos leer
        String rutaArchivo="C:\\Users\\feder\\Desktop\\Federico\\CodoaCodo Java\\codoacodo\\Java\\src\\juegoAhorcado\\listaPalabras.txt";
        File archivo=new File(rutaArchivo);
        Scanner contenidoArchivo=null;
        String linea=" ";
        try {
            //Leemos el contenido del archivo
            System.out.println("*****Leemos el contenido del archivo*****");
            contenidoArchivo=new Scanner(archivo);
            //Leemos cada linea de texto
            /*while (contenidoArchivo.hasNextLine()){
                //Guardamos la linea en un String
                String linea=contenidoArchivo.nextLine();
            }*/
            linea= contenidoArchivo.nextLine();
            contenidoArchivo.close();
        }
        //Si hay error se ejecuta este codigo
        catch (Exception errorContenido){
            System.out.println("Mensaje de la excepcion: "+errorContenido.getMessage());
        }
        return linea;
    }




    public static void main(String[] args) {
        //Elegir una palabra = cadena de caracteres "amarillo"
        //Escribir guiones por cada letra
        //Indicar una letra
        //Buscar esa letra en la palabra
        //Si la letra esta en la palabra reemplazar los guiones correspondiente
        //Aparezca esa letra
        //Definir intentos
        //Mostrar mensaje con el resultado
        String palabraAdivinar;
        ArrayList<String>palabrasAdivinadas;
        int cantidadLetras;
        int intentos,contadorIntentos=0;
        char letra;
        Scanner entradaLetra=new Scanner(System.in);
        palabraAdivinar=seleccionarPalabra();
        System.out.println(palabraAdivinar);
        //Averiguamos la extension de la palabra
        cantidadLetras=palabraAdivinar.length();
        //Agregamos un - entre medio de cada letra para separarlas
        for (int i = 0; i < cantidadLetras; i++) {
            System.out.print("-");
        }
        intentos=cantidadLetras+3;
        do {
            System.out.println("Elige una letra");
            letra=entradaLetra.next().charAt(0);
        }while (contadorIntentos<=intentos);

    }
}
