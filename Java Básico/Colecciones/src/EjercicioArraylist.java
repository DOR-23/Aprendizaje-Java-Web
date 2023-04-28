import java.util.ArrayList;
import java.util.Collections;

public class EjercicioArraylist {
    public static void main(String[] args) {
        // Crear ArrayList numeros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        System.out.println("-----------------------------------");
        encontrarDuplicados(numeros,3);
        System.out.println("-----------------------------------");
        Collections.sort(numeros);
        for(int i = 0; i < numeros.size(); i++){
            System.out.println("numeros.get(" + i + ") = " + numeros.get(i));
        }

        // Strings
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Juan");
        alumnos.add("Ana");
        alumnos.add("María");
        alumnos.add("Ana");
        alumnos.add("Pedro");
        System.out.println("---------------------");
        encontrarDuplicados(alumnos,"Ana");
        System.out.println("---------------------");
        Collections.sort(alumnos);
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println("alumnos.get(" + i + ") = " + alumnos.get(i));
        }


    }

    public static void encontrarDuplicados(ArrayList arr, int n){
        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(n)) System.out.println("arr.get("+ i +") = " + arr.get(i));
        }
    }

    public static void encontrarDuplicados(ArrayList arr, String n){
        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(n)) System.out.println("arr.get("+ i +") = " + arr.get(i));
        }
    }
}
