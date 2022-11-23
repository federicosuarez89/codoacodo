package arrayList;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> misAutos=new ArrayList<String>();
        misAutos.add("Ford");
        misAutos.add("Nissan");
        misAutos.add("Citroen");
        System.out.println(misAutos);
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("Elemento = " + (i+1)+": "+misAutos.get(i));
        }
        misAutos.add("Chevrolet");
        System.out.println(misAutos);
        misAutos.set(1,"Peugeot");
        System.out.println(misAutos);
        misAutos.remove(misAutos.indexOf("Ford"));
        System.out.println(misAutos);


    }


}
