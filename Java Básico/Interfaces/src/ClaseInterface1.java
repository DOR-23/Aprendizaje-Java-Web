public class ClaseInterface1 implements Interface1{
    // Atributos
    String nombre;
    String apellidos;
    //...

    // Métodos de la clase
    public String nombreCompleto(){
        return nombre + " " + apellidos;
    }

    public ClaseInterface1(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Métodos del interface
    @Override
    public void metodoInterface1A() {
        System.out.println("Método 1A del Interface1");
    }

    @Override
    public void metodoInterface1B() {
        System.out.println("Método 1B del Interface1");
    }
}
