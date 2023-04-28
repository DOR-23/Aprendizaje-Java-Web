package empresa.abstracto;

public class TecnicoOperario extends Tecnico{
    int instalacionesMes;
    int kilometraje;
    String equipo;

    public void inventarioAlmacen(){
        // ...
    }

    @Override
    void vacaciones() {
        // ...
    }

    @Override
    void salario() {
        // ...
    }

    @Override
    void formacionContinua() {
        // ...
    }

    @Override
    void planificarInstalaciones() {
        // ...
    }

    public TecnicoOperario(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir, int instalacionesMes, int kilometraje, String equipo) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion, especialidad, formacionEspecifica, carnetConducir);
        this.instalacionesMes = instalacionesMes;
        this.kilometraje = kilometraje;
        this.equipo = equipo;
    }
}
