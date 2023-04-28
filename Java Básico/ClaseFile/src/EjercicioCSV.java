import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCSV {
    public static void main(String[] args) {
        // 1 - leer el contenido del CSV y mostrarlo por consola 
        // 2 - Almacenar los datos (objeto de tipo Alumno) en ArrayList
        // 3 - Listar los alumnos
        // 4 - Guardarlo en otro archivo
        ArrayList<Alumno> listado = new ArrayList<>();
        File archivo = new File("alumnosN4.csv");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                //System.out.println(linea);
                if(!linea.contains("apellido1")) {
                    String[] campos = linea.split(";");
                    Alumno alum = new Alumno(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5]);
                    listado.add(alum);
                }
            }
        }catch(Exception e){
            System.out.println("e.toString() = " + e.toString());
        }

        listado.forEach((n) -> System.out.println(n.toString()));

        // Guardar en otro archivo CSV
        try {
            FileWriter escribir = new FileWriter("exportCSV.txt");
            for(Alumno al:listado){
                escribir.write(al.id+";"+al.apellido1+";"+al.apellido2+";"+al.nombre+";"+al.movil+";"+al.email+"\n");
            }
            escribir.close();
            System.out.println("Escritura terminada");
        }catch (IOException e){
            System.out.println("Se ha producido un error de escritura!");
            System.out.println("e.toString() = " + e.toString());
        }


       
    }
}
