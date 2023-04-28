import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploRegEx {
    public static void main(String[] args) {
        // búsqueda simple de una palabra
        String texto = "En una ubicación 7285 de La Manchaaa de cuyo nombre";
        String buscar = "mancha";

        busqueda(buscar,texto);
        busquedaInsentiva(buscar,texto);

        // Que cualquiera de las palabras separadas "|"
        buscar = "lugar|sitio|ubicación";
        busqueda(buscar,texto);

        // Que contenga al menos coincidencia de uno o más caracteres detrás "."
        buscar = ".de";
        busqueda(buscar,texto);

        // Que empiece por uno o más caracteres detrás de "^"
        buscar = "^en";
        busqueda(buscar,texto);
        busquedaInsentiva(buscar,texto);

        // Que termine en uno o más caracteres antes de "$"
        buscar = "bre$";
        busqueda(buscar,texto);

        // Que empiece o termine en uno o más caracteres antes o después de \b
        buscar = "bre\\b"; //"\\bnombre"
        busqueda(buscar,texto);

        // Que contenga un espacio en blanco
        buscar = "\\s";
        busqueda(buscar,texto);

        // Que contenga un dígito 0..9
        buscar = "\\d";
        busqueda(buscar,texto);

        // Que contenga caracteres comprendidos en un rango [a-z]
        buscar = "[x-z]";
        busqueda(buscar,texto);

        // Que contenga digitos comprendidos en un rango [0-9]
        buscar = "[0-6]";
        busqueda(buscar,texto);

        // Que contenga al menos 2 dígitos consecutivos comprendidos en un rango [0-9]
        buscar = "[2-8]{2}";
        busqueda(buscar,texto);
        // Que contenga al menos un grupo de dígitos comprendido enter 2 y 4 comprendidos en un rango [0-9]
        buscar = "[7-8]{2,3}";
        busqueda(buscar,texto);

        // Que contenga chaaa
        buscar = "cha{3}";
        busqueda(buscar,texto);

        // Password, al memos 1 mayúscula, al menos 1 minúscula, al menos un dígito
        // al menos un carácter especial y al menos 8 caracteres
        texto = "4454df55%";
        buscar = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#%&+_]).{8,}";
        busqueda(buscar,texto);

        // Email
        texto = "eoi.eduardo@corral.es";
        buscar = "^[a-z0-9_]+[[a-z0-9_-]\\.]*\\@[a-z0-9_]+((-[a-z0-9_]+)|([a-z0-9_]*))\\.[a-z]{2,}$";
        busqueda(buscar,texto);
    }

    public static void busqueda(String buscar, String texto){
        // tiene en cuenta las mayúsculas y las minúsculas
        Pattern miPatron = Pattern.compile(buscar);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("Buscando \"" + buscar + "\" --> " + miMatcher.find());
    }

    public static void busquedaInsentiva(String buscar, String texto){
        // no tiene en cuenta las mayúsculas y las minúsculas
        Pattern miPatron = Pattern.compile(buscar, Pattern.CASE_INSENSITIVE);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("Buscando \"" + buscar + "\" --> " + miMatcher.find());
    }

}
