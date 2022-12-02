package calculadora;

import java.util.Scanner;

public class CalculadoraBasica {
    //Creamos la funcion para leer numeros ingresados por teclado
    static double ingresarNumero(String mensaje){
        double numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println(mensaje);
        numero=entrada.nextDouble();
        return numero;
    }
    //Creamos la funcion para sumar 2 numeros
    static double suma(double num1,double num2){
        double resultadoSuma=num1+num2;
        return resultadoSuma;
    }
    //Creamos la funcion para restar 2 numeros
    static double resta(double num1,double num2){
        double resultadoResta=num1-num2;
        return resultadoResta;
    }
    //Creamos la funcion para multiplicar 2 numeros
    static double multiplicar(double num1, double num2){
        double resultadoMultiplicar=num1*num2;
        return resultadoMultiplicar;
    }
    //Creamos la funcion para dividir 2 numeros
    static double dividir(double num1,double num2){
        double resultadoDivision=num1/num2;
        return resultadoDivision;
    }




    public static void main(String[] args) {
        double num1,num2,resultado;
        int opcionUsuario=0;
        Scanner entrada2=new Scanner(System.in);

        System.out.println("**********Calculadora**********");
        System.out.println("1-Suma\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
        try {
            opcionUsuario = entrada2.nextInt();
            switch (opcionUsuario) {
                case 1:
                    System.out.println("Sumar 2 numeros");
                    num1 = ingresarNumero("Ingrese el primer numero");
                    num2 = ingresarNumero("Ingrese el segundo numero");
                    resultado = suma(num1, num2);
                    System.out.println("El resultado de la suma " + num1 + " + " + num2 + " es: " + resultado);
                    break;
                case 2:
                    System.out.println("Restar 2 numeros");
                    num1 = ingresarNumero("Ingrese el primer numero");
                    num2 = ingresarNumero("Ingrese el segundo numero");
                    resultado = resta(num1, num2);
                    System.out.println("El resultado de la resta " + num1 + " - " + num2 + " es: " + resultado);
                    break;
                case 3:
                    System.out.println("Multiplicar 2 numeros");
                    num1 = ingresarNumero("Ingrese el primer numero");
                    num2 = ingresarNumero("Ingrese el segundo numero");
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicacion  " + num1 + " * " + num2 + " es: " + resultado);
                    break;
                case 4:
                    System.out.println("Dividir 2 numeros");
                    num1 = ingresarNumero("Ingrese el primer numero");
                    System.out.println("Recuerde que el numero 2 no puede ser cero porque no es posible la division");
                    num2 = ingresarNumero("Ingrese el segundo numero");
                    resultado = dividir(num1, num2);
                    System.out.println("El resultado de la division " + num1 + " / " + num2 + " es: " + resultado);
                    break;
                case 5:
                    System.out.println("**********************Saliendo del programa**********************");
                    break;
                default:
                    System.out.println("Ha ingresado una opcion que no es correcta");
            }
            }catch (Exception eror){
            System.out.println("Debe ingresar un numero valido");
            }


    }
}
