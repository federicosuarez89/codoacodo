package calculadoraConsola;

import java.util.Scanner;

public class CalculadoraBasica {
    //Creamos la funcion para leer numeros ingresados por teclado
    static int ingresarNumero(String mensaje){
        int numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println(mensaje);
        numero=entrada.nextInt();
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
    static double dividir(int num1,int num2){
        double resultadoDivision=num1/num2;
        return resultadoDivision;
    }
    //Creamos la funcion para calcular potencias
    static double potencia(int base, int exponente){
        double resultado= Math.pow(base,exponente);
        return resultado;
    }

    //Creamos la funcion para calcular la raiz cuadrada a un numero
    static double raiz(double base){
        double resultado=Math.sqrt(base);
        return resultado;
    }



    public static void main(String[] args) {
        double resultado=0;
        int opcionUsuario=0,num1,num2;
        int base=0,exponente=0;
        Scanner entrada2=new Scanner(System.in);

        System.out.println("**********Calculadora**********");
        System.out.println("1-Suma\n2-Resta\n3-Multiplicación\n4-División\n5-Potenciación\n6-Raíz cuadrada\n7-Salir");
        do {
            System.out.println("***Ingrese una opción para realizar su calculo***");
            try {
                opcionUsuario = entrada2.nextInt();
                switch (opcionUsuario) {
                    //Suma
                    case 1:
                        System.out.println("Sumar 2 numeros");
                        num1 = ingresarNumero("Ingrese el primer numero");
                        num2 = ingresarNumero("Ingrese el segundo numero");
                        resultado = suma(num1, num2);
                        System.out.println("El resultado de la suma " + num1 + " + " + num2 + " es: " + resultado);
                        break;
                    //Resta
                    case 2:
                        System.out.println("Restar 2 numeros");
                        num1 = ingresarNumero("Ingrese el primer numero");
                        num2 = ingresarNumero("Ingrese el segundo numero");
                        resultado = resta(num1, num2);
                        System.out.println("El resultado de la resta " + num1 + " - " + num2 + " es: " + resultado);
                        break;
                    //Multiplicacion
                    case 3:
                        System.out.println("Multiplicar 2 numeros");
                        num1 = ingresarNumero("Ingrese el primer numero");
                        num2 = ingresarNumero("Ingrese el segundo numero");
                        resultado = multiplicar(num1, num2);
                        System.out.println("El resultado de la multiplicacion  " + num1 + " * " + num2 + " es: " + resultado);
                        break;
                    //Division
                    case 4:
                        System.out.println("Dividir 2 numeros");
                        num1 = ingresarNumero("Ingrese el primer numero");
                        do {
                            num2 = ingresarNumero("Ingrese el segundo numero, pero recuerde que debe ser distinto de cero");
                            try {
                                resultado = dividir(num1, num2);
                            } catch (Exception error) {
                                System.out.println("Error, ingrese un numero distinto de cero");
                            }
                        } while (num2 == 0);
                        System.out.println("El resultado de la division " + num1 + " / " + num2 + " es: " + resultado);
                        break;
                    //Potenciacion
                    case 5:
                        System.out.println("Calcular la potencia a un número");
                        base = (int) ingresarNumero("Ingrese la base");
                        exponente = (int) ingresarNumero("Ingrese el exponente");
                        resultado = potencia(base, exponente);
                        System.out.println("El resultado de la potenciacion es: " + resultado);
                        break;
                    //Raiz cuadrada
                    case 6:
                        System.out.println("Sacar la raiz cuadrada a un numero");
                        System.out.println("Recuerde que no se puede calcular raíces cuadradas a números negativos");
                        do {
                            try {
                                base = (int) ingresarNumero("Ingrese la base de la raíz");
                                resultado = raiz(base);
                            } catch (Exception error) {
                                System.out.println("Ingrese un numero que no sea negativo");
                            }
                        } while (base < 0);
                        System.out.println("El resultado de la raiz es: " + resultado);
                        break;
                    case 7:
                        System.out.println("**********************Saliendo del programa**********************");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                    }
            }catch (Exception eror) {
                System.out.println("Ha ingresado una opcion invalida");
            }

        }while (opcionUsuario<1 || opcionUsuario>7);

    }
}
