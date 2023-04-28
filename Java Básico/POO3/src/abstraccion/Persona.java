package abstraccion;

abstract class Persona { // Siempre una superclase y no se pueden instanciar objetos
    // atributos
    String nombre;
    String apellidos;
    String email;

    // métodos abstractos
    abstract public void registro();
    abstract public void borrar();
    abstract public void editar();

    // método "normal"
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    // constructor
    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
