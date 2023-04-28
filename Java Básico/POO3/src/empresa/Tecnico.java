package empresa;

public class Tecnico extends Empleado{
    String especialidad;
    String formacionEspecifica;
    String carnetConducir;
    //...
    public void planificarInstalaciones(){
        System.out.println(("planificando!"));
    }

    //...
    public void salario(){
        System.out.println("salario = fijo + comisión por instalaciones");
    }

    public Tecnico(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion);
        this.especialidad = especialidad;
        this.formacionEspecifica = formacionEspecifica;
        this.carnetConducir = carnetConducir;
    }
}
