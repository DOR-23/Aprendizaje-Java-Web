package empresa;

public class Administrativo extends Empleado{
    String especialidad;
    String firma;
    //..
    public void contabilizar(){
        System.out.println("Contabilizo");
    }
    // ...
    public void salario(){
        System.out.println("Sueldo fijo");
    }

    public Administrativo(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String firma) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion);
        this.especialidad = especialidad;
        this.firma = firma;
    }
}
