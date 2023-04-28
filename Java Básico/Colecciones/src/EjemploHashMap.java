import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        // Declaración
        HashMap<Integer,String> agenda = new HashMap<>();

        // Añadir elementos
        agenda.put(609090909,"Pepe");
        agenda.put(609090910,"Ana");
        agenda.put(609090911,"Pepe");
        agenda.put(609090912,"Juan");
        agenda.put(609090913,"Paco");


        // Obtener un valor que corresponde a un índice determinado
        System.out.println("agenda.get(609090910) = " + agenda.get(609090910));
        System.out.println("agenda.get(609090914) = " + agenda.get(609090914)); // no existe -> null
        System.out.println("-------------------------------");

        // Obtener todas las claves en una matriz
        System.out.println("agenda.keySet() = " + agenda.keySet());
        System.out.println("-------------------------------");
        recorrer(agenda);
        recorrer2(agenda);

        // Obtener todos los valores
        System.out.println("agenda.values() = " + agenda.values());
        System.out.println("-------------------------------");

        // Buscar
        System.out.println("agenda.containsKey(609090910) = " + agenda.containsKey(609090910));
        System.out.println("agenda.containsKey(609090954) = " + agenda.containsKey(609090954));
        System.out.println("agenda.containsValue(\"Ana\") = " + agenda.containsValue("Ana"));
        System.out.println("agenda.containsValue(\"Joaquin\") = " + agenda.containsValue("Joaquin"));

        // Modificar
        agenda.replace(609090911,"José");
        recorrer(agenda);
        agenda.replace(609090911,"José","Pepe");
        recorrer(agenda);
        System.out.println("agenda.replace(609090911,\"José\",\"Paco\") = " + agenda.replace(609090911,"José","Paco"));
        System.out.println("agenda.replace(609090911,\"Pepe\",\"Paco\") = " + agenda.replace(609090911,"Pepe","Paco"));
        recorrer(agenda);

        // Borrar una clave determinada y su valor asociado
        System.out.println("agenda.remove(609090909) = " + agenda.remove(609090909)); // retorna el valor asociado
        recorrer(agenda);
        System.out.println("agenda.remove(609090909) = " + agenda.remove(609090909)); // ya no existe --> null

        // Modificar una clave
        String valor = agenda.remove(609090911);
        if(valor != null){
            agenda.put(609609609,valor);
        }
        recorrer(agenda);
    }

    public static void recorrer(HashMap<Integer,String> mapa){
        for(Integer clave:mapa.keySet()){
            System.out.println("telefono = " + clave + "---> nombre = " + mapa.get(clave));
        }
        System.out.println("------------------------------------");
    }

    public static void recorrer2(HashMap<Integer,String> mapa){
        mapa.forEach((telefono,nombre) -> System.out.println("telefono = " + telefono + "---> nombre = " + nombre));
        System.out.println("------------------------------------");
    }



}
