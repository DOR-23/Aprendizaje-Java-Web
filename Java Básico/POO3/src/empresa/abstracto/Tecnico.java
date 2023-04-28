package empresa.abstracto;

abstract class Tecnico extends Empleado {
    String especialidad;
    String formacionEspecifica;
    String carnetConducir;
    //...
    abstract void planificarInstalaciones();

    public Tecnico(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion);
        this.especialidad = especialidad;
        this.formacionEspecifica = formacionEspecifica;
        this.carnetConducir = carnetConducir;
    }
}
