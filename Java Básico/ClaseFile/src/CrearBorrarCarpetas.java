import java.io.File;

public class CrearBorrarCarpetas {
    public static void main(String[] args) {
        // Crear carpeta
//        File archivo = new File("carpeta1/carpeta2");
//        //if(archivo.mkdir()){  // crea la carperta si existe el path
//        if(archivo.mkdirs()){  // crea todo el path aunque no existiera
//            System.out.println("la carpeta " + archivo.getName() + " se ha creado");
//        }else{
//            System.out.println("no he podido crear la carptea " + archivo.getName());
//        }

        // mover archivo a carpeta
        File archivo1 = new File("miarchivo.txt");
        File archivo2 = new File("carpeta1/miarchivo.txt");
//        File archivo3 = new File("miarchivonuevo.txt");
//        archivo1.renameTo(archivo2);
//        archivo2.renameTo(archivo3);

        // Eliminar carpeta
        File carpeta = new File("carpeta1");
        if(carpeta.exists()){
            if(carpeta.delete()){
                System.out.println(carpeta.getName() + " ha sido eliminada");
            }else{
                System.out.println(carpeta.getName() + " no ha podido ser eliminada");
            }

        }else{
            System.out.println(carpeta.getName() + " no existe");
        }


        //
    }
}
