import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploJavaTime {
    public static void main(String[] args) {
        // Fecha
        LocalDate objFecha = LocalDate.now();
        System.out.println("objFecha = " + objFecha);

        // Formato dd/MM/YYYY
        DateTimeFormatter fmtFecha = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        System.out.println("objFecha.format(fmtFecha) = " + objFecha.format(fmtFecha));
        
        // Hora
        LocalTime objHora = LocalTime.now();
        System.out.println("objHora = " + objHora);
        
        // "Alternativas de formato" pero no muy optimas
        System.out.println("objHora.toString().substring(0,8) = " + objHora.toString().substring(0,8));
        System.out.printf("La hora actual es %s y no otra\n",objHora.toString().substring(0,8));
        System.out.printf("La hora actual es %.8s y no otra\n",objHora);
        System.out.printf("Hoy es %s y son las %.8s\n",objFecha.format(fmtFecha),objHora);
        
        // Formato hora hh:mm:ss
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("objHora.format(fmtHora) = " + objHora.format(fmtHora));
        
        // Fecha y hora al mismo tiempo
        LocalDateTime objFechaHora = LocalDateTime.now();
        System.out.println("objFechaHora = " + objFechaHora);
        DateTimeFormatter fmtFechaHora = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
        System.out.println("objFechaHora.format(fmtFechaHora) = " + objFechaHora.format(fmtFechaHora));

        // Establecer Fecha y Hora
        objFechaHora = LocalDateTime.of(2025,5,15,12,1,2);
        System.out.println("objFechaHora.format(fmtFechaHora) = " + objFechaHora.format(fmtFechaHora));

        objFechaHora = LocalDateTime.of(2025, Month.MAY,15,12,1,2);
        System.out.println("objFechaHora.format(fmtFechaHora) = " + objFechaHora.format(fmtFechaHora));

    }
}
