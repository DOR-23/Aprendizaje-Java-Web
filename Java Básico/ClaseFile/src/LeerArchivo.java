import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        String linea;
        try {
            // en el raiz de mi proyecto
            File archivo = new File("miarchivo.txt");

            // Path completo desde raiz sistema de archivos
            //File archivo = new File("C:\\Users\\ecorr\\Documents\\CursoEOI\\Nacional4\\miarchivodeprueba.txt");
            // Path relativo desde el raiz de mi proyecto
            // File archivo = new File("../miarchivodeprueba.txt");
            //File archivo = new File("out/production/ClaseFile/miarchivo.txt");

            //if(archivo.exists()) {
                Scanner leer = new Scanner(archivo);
                while (leer.hasNextLine()) {
                    linea = leer.nextLine();
                    System.out.println(linea);
                }
//            }else{
//                System.out.println("Archivo no encontrado!");
//            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado!");
            System.out.println(e.toString());
        }
    }
}
