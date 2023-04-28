import java.util.HashMap;

public class BuscarHashMap {
    public static void main(String[] args) {
        // Declaración
        HashMap<Integer,String> agenda = new HashMap<>();

        // Añadir elementos
        agenda.put(609090909,"Pepe");
        agenda.put(609090910,"Ana");
        agenda.put(609090911,"Pepe");
        agenda.put(609090912,"Juan");
        agenda.put(609090913,"Paco");

        buscaNombre(agenda,"Evaristo");
        buscaNombre(agenda,"Ana");
        buscaNombre(agenda,"Pepe");

        buscaNombre2(agenda,"Pepe");
    }

    public static void buscaNombre(HashMap<Integer,String> mapa, String nombre){
        if(mapa.containsValue(nombre)){
            for(Integer num: mapa.keySet()){
                if(mapa.get(num).equals(nombre)){
                    System.out.println(nombre + " --> " + num);
                }
            }
        }else{
            System.out.println("Nombre " + nombre + " no encontrado");
        }
    }

    public static void buscaNombre2(HashMap<Integer,String> mapa, String nombre){
        if(mapa.containsValue(nombre)){
            mapa.forEach((telefono,nome) -> {
                if(nome.equals(nombre))System.out.println(nombre + " --> " + telefono);
            }
            );
        }else{
            System.out.println("Nombre " + nombre + " no encontrado");
        }
    }
}
