package abstraccion;

public class EjemploPersona {
    public static void main(String[] args) {
        // No se pueden instanciar objetos de una clase abstracta
        //Persona miPersona = new Persona("Eduardo","Corral","eduardo@corral.es");

        HijaPersona miPersona = new HijaPersona("Eduardo","Corral","eduardo@corral.es","Mi Casa");
        // Heredados
        miPersona.nombreCompleto();
        // Heredados e implementados
        miPersona.registro();
        miPersona.borrar();
        miPersona.editar();
        // de la clase hija
        miPersona.visitarPadre();
        // heredado y override
        System.out.println(miPersona.nombreCompleto());

    }
}
