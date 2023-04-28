package elpaquete;

import elpaquete.elsubpaquete.PruebaPaquete;

public class ModificadorAcceso2 {
    public static void main(String[] args) {
        PruebaPaquete objeto = new PruebaPaquete();
        // No puedo acceder a un atributo por "defecto"
//        objeto.nombre = "Eduardo";
//        System.out.println("objeto.nombre = " + objeto.nombre);

        //objeto.apellido = "Corral"; // private
        objeto.setApellido("Corral");
        System.out.println("objeto.getApellido() = " + objeto.getApellido());

        // public
        objeto.email = "eduardo@corral.es";
        System.out.println("objeto.email = " + objeto.email);

        // protected = (fuera del paquete) funciona como private
        //objeto.telefono = "654333333";
        objeto.setTelefono("654333333");
        //System.out.println("objeto.telefono = " + objeto.telefono);
        System.out.println("objeto.getTelefono() = " + objeto.getTelefono());

        // No puedo ejecutart un método "defecto" fuera de su paquete
        //objeto.metodoDefecto();
        objeto.metodoPublico();
        // Un método privado solo puede ejecutarse desde dentro de la clase
        //objeto.metodoPrivado();
        // Un método protected se convierte en privado fuera de su paquete
        //objeto.metodoProtected();
    }
}
