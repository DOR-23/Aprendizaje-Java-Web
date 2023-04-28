import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            FileWriter escribir = new FileWriter("miarchivo.txt",true);
            escribir.write("Escribiendo en miarchivo.txt desde mi aplicación Java\n");
            escribir.write("Segunda escritura\n");
            escribir.write("Tercera escritura\n");
            escribir.write("Cuarta escritura\n");
            escribir.close();
            System.out.println("Escritura terminada");
        }catch (IOException e){
            System.out.println("Se ha producido un error de escritura!");
            System.out.println("e.toString() = " + e.toString());
        }
    }
}
