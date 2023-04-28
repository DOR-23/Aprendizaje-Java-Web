import java.util.Collections;
import java.util.LinkedList;

public class EjemploLindekList {
    public static void main(String[] args) {
        // Crear LinkedList
        LinkedList<Integer> numeros = new LinkedList<>();
        
        // Añadir elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(5);
        numeros.add(9);

        recorrer(numeros);

        // Leer una posición determinada
        System.out.println("numeros.get(3) = " + numeros.get(3));
        System.out.println("numeros.getFirst() = " + numeros.getFirst());
        System.out.println("numeros.getLast() = " + numeros.getLast());

        // ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        // Métodos add específicos de LinkedList
        numeros.addFirst(23);
        numeros.addLast(45);
        recorrer(numeros);

        // eliminar
        numeros.remove(3);
        recorrer(numeros);

        // Métodos remove específicos de LinkedList
        numeros.removeFirst();
        numeros.removeLast();
        recorrer(numeros);
        
        // Buscar
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3));
        System.out.println("numeros.indexOf(97) = " + numeros.indexOf(97));
        System.out.println("numeros.lastIndexOf(3) = " + numeros.lastIndexOf(3));
        System.out.println("numeros.contains(5) = " + numeros.contains(5));
        System.out.println("numeros.contains(54) = " + numeros.contains(54));

        // vaciar
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        System.out.println("numeros.size() = " + numeros.size());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        System.out.println("numeros.size() = " + numeros.size());
    }
    
    public static void recorrer(LinkedList<Integer> num){
        System.out.println("-------------------------");
//        for(Integer n:num){
//            System.out.println("n = " + n);
//        }
        for(int i = 0; i < num.size(); i++){
            System.out.println("num.get(" + i + ") = " + num.get(i));
        }
        System.out.println("-------------------------");
    }
}
