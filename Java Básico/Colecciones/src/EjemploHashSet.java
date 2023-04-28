import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        // Crear un HashSet
        HashSet<Integer> numeros = new HashSet<>();

        // Añadir
        numeros.add(4);
        numeros.add(9);
        numeros.add(11);
        numeros.add(7);
        numeros.add(5);
        numeros.add(21);

        // Añadir duplicado
        System.out.println("numeros.add(34) = " + numeros.add(34));
        System.out.println("numeros.add(11) = " + numeros.add(11));

        recorrer(numeros);
        
        // Tamaño
        System.out.println("numeros.size() = " + numeros.size());

        // Eliminar un elemento
        System.out.println("numeros.remove(34) = " + numeros.remove(34));
        recorrer(numeros);
        System.out.println("numeros.remove(34) = " + numeros.remove(34));

        // búsqueda
        System.out.println("numeros.contains(5) = " + numeros.contains(5));
        System.out.println("numeros.contains(34) = " + numeros.contains(34));

        // vaciar
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());

    }
    public static void recorrer(HashSet<Integer> num){
        System.out.println("-----------------------------");
        for (Integer n:num){
            System.out.println("n = " + n);
        }
        System.out.println("-----------------------------");
    }
}
