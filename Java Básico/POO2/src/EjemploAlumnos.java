//import elpaquete.Contactos;

// Paquetes
//1 - import elpaquete.elsubpaquete.PruebaPaquete;
//2 - no importo nada
import static elpaquete.elsubpaquete.PruebaPaquete.mensaje; //3

public class EjemploAlumnos {
    public static void main(String[] args) {
        // Paquetes
        // 1 - PruebaPaquete.mensaje();
        // 2 - elpaquete.elsubpaquete.PruebaPaquete.mensaje();
        mensaje(); //3


        // Uso de enumeradores
        Alumno eduardo = new Alumno("Eduardo","Corral Muñoz","eduardo@corral.es",Contactos.MARTA);
        System.out.println("eduardo.nombre = " + eduardo.nombre);
        System.out.println("eduardo.getApellidos() = " + eduardo.getApellidos());
        System.out.println("eduardo.getEmail() = " + eduardo.getEmail());
        System.out.println("eduardo.getCampaniero() = " + eduardo.getCampaniero());
        System.out.println("eduardo.getCampaniero().getNombre() = " + eduardo.getCampaniero().getNombre());
        System.out.println("eduardo.getCampaniero().getEmail() = " + eduardo.getCampaniero().getEmail());
        System.out.println("eduardo.getCampaniero().getMovil() = " + eduardo.getCampaniero().getMovil());

        System.out.println("------------------------------------");
        Contactos[] companieros = {Contactos.MARTA,Contactos.JUAN};
        String name = "Eduardo";
        Alumno2 eduardo2 = new Alumno2(name,"Corral Muñoz","eduardo@corral.es",companieros);
        System.out.println("eduardo2.nombre = " + eduardo2.nombre);
        System.out.println("eduardo2.getApellidos() = " + eduardo2.getApellidos());
        System.out.println("eduardo2.getEmail() = " + eduardo2.getEmail());
        
        //System.out.println("eduardo2.getGrupo() = " + eduardo2.getGrupo());
        for(Contactos miembro:eduardo2.getGrupo()){
            System.out.println("miembro = " + miembro);
            System.out.println("miembro.getNombre() = " + miembro.getNombre());
            System.out.println("miembro.getEmail() = " + miembro.getEmail());
            System.out.println("miembro.getMovil() = " + miembro.getMovil());
        }
        
    }
}
