import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjercicioStream {
    // 1 - Crear un stream de strings a partir de alumnosN4.csv
    // 2 - Crear una clase alumno que represente los dos de alumnosN4
    // 3 - Mediante operadores de Stream convertir cada elemento en objeto alumno
    // 4 - alumno.toString
    public static void main(String[] args) {
        File archivo = new File("alumnosN4.csv");
        try {
            Stream<String> lineas = Files.lines(archivo.toPath());
            lineas.filter(lin -> !lin.contains("apellido1"))
                    .forEach(System.out::println);
        }catch (IOException e){
            System.out.println("e.toString() = " + e.toString());
        }
    }
}
