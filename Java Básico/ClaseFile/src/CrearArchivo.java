import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("miarchivo.txt");
            // Devuelve true si lo ha creado y false si no lo ha hecho
            //System.out.println("archivo.createNewFile() = " + archivo.createNewFile());

//            if(archivo.createNewFile()){
//                System.out.println("Archivo creado correctamente!");
//            }else{
//                System.out.println("Archivo ya existe!");
//            }

            if(!archivo.exists()){
                archivo.createNewFile();
                System.out.println("Archivo " + archivo.getName() + " creado!");
            }else{
                System.out.println("El archivo " + archivo.getName() + " ya existe!");
            }

        }catch (IOException e){
            System.out.println("Error al crear el archivo");
            System.out.println("e.toString() = " + e.toString());
        }
    }
}
