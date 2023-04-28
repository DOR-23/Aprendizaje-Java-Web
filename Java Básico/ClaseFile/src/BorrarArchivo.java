import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        File archivo = new File("miarchivo.txt");
        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("El archivo " + archivo.getName() + " ha sido eliminado!");
            }else{
                System.out.println("No he podido eliminar el archivo " + archivo.getName());
            }
        }else{
            System.out.println("El archivo " + archivo.getName() + " no exsite!");
        }
    }
}
