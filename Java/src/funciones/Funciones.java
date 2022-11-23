package funciones;

import java.util.ArrayList;

public class Funciones {
    //Creamos un procedimiento(no tiene retorno)
    static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
    //Creamos una funcion(tiene retorno)
    static int suma(int numA,int numB){
        int resultado = numA+numB;
        return resultado;
    }
    //Creamos un procedimientos (sin retorno)
    static void saludarNombres(ArrayList<String>nombres){
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Hola "+nombres.get(i));
        }
    }
    //Creamos una funcion(con retorno)
    static ArrayList<String> devuelveArrayList(ArrayList<String>nombres){
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Hola "+nombres.get(i));
        }
        return nombres;
    }

    public static void main(String[] args) {
        System.out.println("Usamos el procedimiento saludar()");
        saludar("Federico");
        saludar("Yury");
        saludar("Leandro");
        System.out.println("********************************");
        System.out.println("Usamos funcion suma()");
        System.out.println("El resultado de la suma es: "+suma(3,5));

        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Federico Leandro");
        nombres.add("Yury Andrea");
        System.out.println("********************************");
        System.out.println("Usamos procedimiento saludarNombres() ");
        saludarNombres(nombres);
        System.out.println("********************************");
        System.out.println("Usamos funcion devuelveArrayList()");
        devuelveArrayList(nombres);

    }
}
