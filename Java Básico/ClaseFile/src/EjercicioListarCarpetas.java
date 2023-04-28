import java.io.File;

public class EjercicioListarCarpetas {
    // Listar el contenido de una carpeta del sistema de archivos y
    // de todas sus subcarpetas mostrando el tamaño de los archivos
    // .idea -> directorio
    //      gitignore -> 356 bytes
    //      ...
    // carpeta1 -> directorio
    //      miarchivo.txt -> 56 bytes
    // carpeta2 -> directorio
    // ...
    static int nivel = 0; // indica el nivel de profundidad dentro del árbol de carpetas

    public static void main(String[] args) {
        File archivo = new File(".");
        recorrerCarpeta(archivo);
    }

    public static void recorrerCarpeta(File dir){
        nivel++;
        File[] contenido = dir.listFiles();
        for(File nombre:contenido){
            for(int i = 1; i < nivel; i++)
                System.out.print("\t");

            if(nombre.isDirectory()){
                System.out.println(nombre.getName());
                recorrerCarpeta(nombre);
            }else{
                System.out.println(nombre.getName() + "\t\t" + nombre.length());
            }
        }
        nivel--;
    }
}
