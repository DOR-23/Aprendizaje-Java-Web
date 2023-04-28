import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {
        HashSet<String> coches = new HashSet<>();
        coches.add("Renault");
        coches.add("Seat");
        coches.add("Volvo");
        coches.add("Hiunday");

        Iterator<String> iter = coches.iterator();
        while(iter.hasNext())
            System.out.println("iter.next() = " + iter.next());

        //Con HashMap hey métodos más eficentes
//    // Declaración
//    HashMap<Integer,String> agenda = new HashMap<>();
//
//    // Añadir elementos
//        agenda.put(609090909,"Pepe");
//        agenda.put(609090910,"Ana");
//        agenda.put(609090911,"Pepe");
//        agenda.put(609090912,"Juan");
//        agenda.put(609090913,"Paco");
//
//        Iterator<Integer> iter1 = agenda.keySet().iterator();
//        while(iter1.hasNext()){
//            int indice = iter1.next();
//            System.out.println(indice + " ---> " + agenda.get(indice));
//        }
//        Iterator<String> iter2 = agenda.values().iterator();
}
}
