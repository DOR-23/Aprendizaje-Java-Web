public class ClaseInterface2 implements Interface1, Interface2 {
    // Atributos
    String nombre;
    String apellido;
    // ...

    // Métodos de la clase
    public String nombreCompleto2(){
        return nombre + " " + apellido;
    }

    public ClaseInterface2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos de los interfaces
    @Override
    public void metodoInterface1A() {
        System.out.println("Método 1A del Interface1");
    }

    @Override
    public void metodoInterface1B() {
        System.out.println("Método 1B del Interface1");
    }

    @Override
    public void metodoInterface2A() {
        System.out.println("Método 2A del Interface2");
    }

    @Override
    public void metodoInterface2B() {
        System.out.println("Método 2A del Interface2");
    }
}
