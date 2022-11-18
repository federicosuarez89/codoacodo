package holamundo;

public class TiposDeDatos {
    public static void main(String[] args) {
        int edad = 50;
        int contador=0;
        String nombre = "Norberto";
        char sexo = 'M';
        boolean esMayorEdad=true;
        double peso = 78.5;
        double potencia=Math.pow(5,2);

        System.out.println("Edad: "+edad);
        System.out.println("Nombre: "+nombre);
        System.out.println("Sexo: "+sexo);
        System.out.println("Es mayor de edad: "+esMayorEdad);
        System.out.println("Peso: "+peso);
        System.out.println(potencia);
        contador++;
        System.out.println(contador);
        contador++;
        System.out.println("Contador: "+contador);

    }
}
