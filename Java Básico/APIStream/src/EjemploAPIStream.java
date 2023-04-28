import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploAPIStream {
    public static void main(String[] args) {
        // Crear Stream desde una lista de valores
        Stream<String> nombres = Stream.of("Juan", "Ana", "María", "Pepe");
        //nombres.forEach(n-> System.out.println(n));
        nombres.forEach(System.out::println);
        System.out.println("-----------------------------------");

        // Crear Stream desde una matriz
        String[] matrizNombres = {"Juan", "Ana", "María", "Pepe"};
        Stream<String> nombres1 = Stream.of(matrizNombres);
        nombres1.forEach(System.out::println);
        System.out.println("-----------------------------------");
        // el origen de datos permanece inalterado
        for (String nom : matrizNombres) {
            System.out.println("nom = " + nom);
        }
        // si ya se ha operado (ejecutado) el Stream queda vacío y no se puede volver a operar
        //nombres1.forEach(System.out::println);
        System.out.println("-----------------------------------");
        Stream<String> nombres1a = Arrays.stream(matrizNombres);
        nombres1a.forEach(System.out::println);

        System.out.println("-----------------------------------");

        // Crear Stream "construyendolo" -> Stream builder
        Stream<String> nombres2 = Stream.<String>builder()
                .add("Juan")
                .add("Ana")
                .add("María")
                .add("Pepe")
                .build();
        nombres2.forEach(System.out::println);
        System.out.println("-----------------------------------");

        // Crear Stream desde Colección
        ArrayList<String> arrayListNombres = new ArrayList<>();
        arrayListNombres.add("Juan");
        arrayListNombres.add("Ana");
        arrayListNombres.add("María");
        arrayListNombres.add("Pepe");

        // Creo Stream y luego opero
        Stream<String> nombres3 = arrayListNombres.stream();
        nombres3.forEach(System.out::println);
        System.out.println("-----------------------------------");

        // Crear y operar directamente
        arrayListNombres.stream().forEach(System.out::println);
        System.out.println("-----------------------------------");


        // Operadores intermedios map y peek
        Stream<String> nombres4 = Stream.of("Juan", "Ana", "María", "Pepe");
        nombres4.peek(nom -> System.out.println("nom antes de map= " + nom))
                .map(nom -> nom.toLowerCase().replace("a", "e"))
                //.peek(nom -> System.out.println("nom después de map1= " + nom))
                .map(nom -> nom.toUpperCase())
                .forEach(System.out::println);
        System.out.println("-----------------------------------");
        // Convertir el flujo de datos en colección --> operador final
        Stream<String> nombres5 = Stream.of("Juan", "Ana", "María", "Pepe");
        List<String> lista = nombres5.map(nom -> nom.toUpperCase())
                .map(nom -> nom.replace("J", "G"))
                .collect(Collectors.toList());
        //.toList();

        for(String nombre:lista){
            System.out.println("nombre = " + nombre);
        }
        System.out.println("-----------------------------------");
        // Con ArrayList
        Stream<String> nombres6 = Stream.of("Juan", "Ana", "María", "Pepe");
        ArrayList<String> arrayLista = nombres6.map(nom -> nom.toLowerCase())
                .collect(Collectors.toCollection(ArrayList::new));
        for(String nombre:arrayLista){
            System.out.println("nombre = " + nombre);
        }
        System.out.println("-----------------------------------");
        // Convertir en objetos usuario
        Stream<String> nombres7 = Stream.of("Juan", "Ana", "María", "Pepe");
        nombres7.map(nom -> new Usuario(nom,"","",""))
                .peek(us -> System.out.println("us = " + us.nombre))
                .forEach(us -> System.out.println("us.toString() = " + us.toString()));
        System.out.println("-----------------------------------");
        // operador filter
        Stream<String> nombres8 = Stream.of("Juan", "Ana", "María", "Pepe");
        String name = "JUAN";
        nombres8.map(nom -> nom.toUpperCase())
                .filter(nom-> nom.contains("A") && nom.contains("N"))
                .filter(nom -> nom.equals(name))
                .forEach(nom -> System.out.println("nom = " + nom));
        System.out.println("-----------------------------------");
        
        // anymatch y allmatch --> terminal
        // al menos uno coincide
        Stream<String> nombres9 = Stream.of("Juan", "Ana", "María", "Pepe");
        boolean any = nombres9.map(nom -> nom.toLowerCase())
                .anyMatch(nom -> nom.contains("y"));
        System.out.println("any = " + any);

        // Todos cumplen la condición
        Stream<String> nombres10 = Stream.of("Juan", "Ana", "María", "Pepe");
        boolean all = nombres10.map(nom -> nom.toUpperCase())
                .filter(nom -> nom.contains("A"))
                .allMatch(nom -> nom.contains("A"));
        System.out.println("all = " + all);
        System.out.println("-----------------------------------");
        
        // count --> terminal
        Stream<String> nombres11 = Stream.of("Juan", "","Ana","", "María", "Pepe");
        long contador = nombres11
                .map(nom -> nom.toUpperCase())
                .filter(nom -> !nom.isEmpty())
                //.filter(nom -> nom.contains("A"))
                .count();
        System.out.println("contador = " + contador);
        System.out.println("-----------------------------------");

        // operador distinct --> Terminal
        Stream<String> nombres12 = Stream.of("Juan", "","Ana","Pepe","Juan","", "María","Juan", "Pepe");
        nombres12.distinct().forEach(System.out::println);
        System.out.println("-----------------------------------");
        
        // operador reduce --> Terminal
        Stream<String> nombres13 = Stream.of("Juan", "","Ana","", "María", "Pepe");
        String resultado = nombres13.filter(nom -> !nom.isEmpty())
                .reduce("El resultado concatenado es =", (acumulador,valor)-> acumulador + valor + ",");
        System.out.println("resultado = " + resultado.substring(0,resultado.length()-1));
        
        // Streams de enteros
        // reduce
        Stream<Integer> numeros = Stream.of(5,10,15,20,25);
        //int res = numeros.reduce(0,(a,b) -> a + b);
        int res = numeros.reduce(1,(a,b) -> a * b);
        System.out.println("res = " + res);
        System.out.println("-----------------------------------");

        // rangos numéricos
        //IntStream, LongStream ... DoubleStream
        // sum() -> terminal
        IntStream numeros1 = IntStream.of(5,10,15,20,25);

        // sumar todos los números positivos de un rango que sean múltiplos de 5
        //IntStream numeros2 = IntStream.range(-5,20); // -5 .. 19
        IntStream numeros2 = IntStream.rangeClosed(-5,20); // -5 .. 20
        res = numeros2.map(n -> {
                    if(n % 5 != 0)
                        n = 0;
                    return n;
                })
                .filter(n -> n > 0)
                .peek(n-> System.out.println("n = " + n)).sum();
        System.out.println("res = " + res);
        System.out.println("-----------------------------------");

        // Estadísticas int ... double
        IntStream numeros3 = IntStream.rangeClosed(-5,20); // -5 .. 20

        IntSummaryStatistics estadisticas = numeros3.summaryStatistics();
        System.out.println("estadisticas.getMax() = " + estadisticas.getMax());
        System.out.println("estadisticas.getMin() = " + estadisticas.getMin());
        System.out.println("estadisticas.getAverage() = " + estadisticas.getAverage());
        System.out.println("estadisticas.getSum() = " + estadisticas.getSum());
        System.out.println("estadisticas.getCount() = " + estadisticas.getCount());
        System.out.println("estadisticas.toString() = " + estadisticas.toString());
    }
}
