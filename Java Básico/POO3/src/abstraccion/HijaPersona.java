package abstraccion;

public class HijaPersona extends Persona{
    // atributo
    String domicilio;

    // método "normal"
    public void visitarPadre(){
        System.out.println("Visto a mi padre");
    }

    public String nombreCompleto(){
        return super.nombreCompleto() + "\n" + this.domicilio;
    }
    @Override
    public void registro() {
        System.out.println("me registro");
    }

    @Override
    public void borrar() {
        System.out.println("borro mis datos");
    }

    @Override
    public void editar() {
        System.out.println("modifico mis datos");
    }

    // Constructor
    public HijaPersona(String nombre, String apellidos, String email, String domicilio) {
        super(nombre, apellidos, email);
        this.domicilio = domicilio;
    }
}
