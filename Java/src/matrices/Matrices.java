package matrices;

public class Matrices {
    public static void main(String[] args) {
        //Inicializamos la matriz
        int miMatriz[]=new int[5];
        miMatriz[0]=1;
        miMatriz[1]=2;
        miMatriz[2]=3;
        miMatriz[3]=4;
        miMatriz[4]=5;
        System.out.println("Valores de mi matriz: ");
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.print(miMatriz[i]+" - ");
        }

    }
}
