public class ClaseHeredaInterface2 extends ClaseInterface1 implements Interface2{
    String email;

    public ClaseHeredaInterface2(String nombre, String apellidos, String email) {
        super(nombre, apellidos);
        this.email = email;
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
