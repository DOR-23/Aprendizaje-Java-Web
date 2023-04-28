package elpaquete.elsubpaquete;

public class ModificadorAcceso {
    public static void main(String[] args) {
        PruebaPaquete objeto = new PruebaPaquete();
        // default
        objeto.nombre = "Eduardo";
        System.out.println("objeto.nombre = " + objeto.nombre);

        //objeto.apellido = "Corral"; // private
        objeto.setApellido("Corral");
        System.out.println("objeto.getApellido() = " + objeto.getApellido());

        // public
        objeto.email = "eduardo@corral.es";
        System.out.println("objeto.email = " + objeto.email);
        
        // protected
        objeto.telefono = "654333333";
        System.out.println("objeto.telefono = " + objeto.telefono);

        objeto.metodoDefecto();
        objeto.metodoPublico();
        // Un método privado solo puede ejecutarse desde dentro de la clase
        //objeto.metodoPrivado();
        objeto.metodoProtected();
    }
}
