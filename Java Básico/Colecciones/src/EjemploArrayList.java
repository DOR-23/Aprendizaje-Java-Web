import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Añadir elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        
        // Obtener un valor almacenado en un índice
        // en un array numeros[3]
        System.out.println("numeros.get(3) = " + numeros.get(3));
        
        // Obtener la dimensión
        // en array numeros.length
        System.out.println("numeros.size() = " + numeros.size());

        // Recorrer ArrayList
//        for(int i = 0; i < numeros.size(); i++){
//            System.out.println("numeros.get(" + i + ") = " + numeros.get(i));
//        }
//        for(Integer n:numeros){
//        //for(int n:numeros){
//            System.out.println("n = " + n);
//        }
        recorrer(numeros);

        // Insertar elemento en una posición determinada
        numeros.add(2,11);
        recorrer(numeros);

        // Eliminar un elemento en una posición determinada
        numeros.remove(2);
        recorrer(numeros);
        
        // Modificar el valor de una posición determinada
        // en un array sería numeros[2] = 8;
        numeros.set(2,8);
        recorrer(numeros);
        
        // Buscar un elemento por su valor
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3));
        System.out.println("numeros.lastIndexOf(3) = " + numeros.lastIndexOf(3));
        System.out.println("numeros.indexOf(48) = " + numeros.indexOf(48));

        // Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        // saber si contiene un valor
        System.out.println("numeros.contains(3) = " + numeros.contains(3));
        System.out.println("numeros.contains(48) = " + numeros.contains(48));

        // Otros métodos
        numeros.forEach((n)-> System.out.println(n)); // expresiones lambda
        System.out.println("numeros.toString() = " + numeros.toString());
        System.out.println("numeros.subList(3,7) = " + numeros.subList(3,8));

        // Iterator
        iterar(numeros);

        // Vaciar
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        System.out.println("numeros.size() = " + numeros.size());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        System.out.println("numeros.size() = " + numeros.size());


    }

    public static void recorrer(ArrayList num){
        System.out.println("-------------------------------");
        for(int i = 0; i < num.size(); i++){
            System.out.println("num.get(" + i + ") = " + num.get(i));
        }

    }

    public static void iterar(ArrayList num){
        System.out.println("-------------------------------");
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        System.out.println("-------------------------------");
    }
}
