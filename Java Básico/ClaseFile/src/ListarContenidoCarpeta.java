import java.io.File;

public class ListarContenidoCarpeta {
    public static void main(String[] args) {
        File archivo = new File("."); // . representa la carpeta raiz del proyecto

        // solo los nombres -> Strings
        String[] contenido = archivo.list();
        for(String nombre:contenido){
            System.out.println( nombre);
        }
        System.out.println("----------------------------------------");

        // con objetos File
        File[] conten = archivo.listFiles();
        for (File nombre:conten){
            System.out.println(nombre.getName() + " - " + nombre.length() + " --> directorio: " + nombre.isDirectory());
        }
    }

}
