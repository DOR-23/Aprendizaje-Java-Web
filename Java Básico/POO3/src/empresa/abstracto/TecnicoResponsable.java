package empresa.abstracto;

import empresa.TecnicoOperario;

public class TecnicoResponsable extends Tecnico{
    String nombreEquipo;
    TecnicoOperario[] equipo;
    //...

    public void asignacionTrabajo(){
        System.out.println("Distribuir trabajo a los miembros de su equipo");
    }

    public void supervisionEquipo(){
        System.out.println("Supervisa equipo");
    }

    @Override
    void vacaciones() {

    }

    @Override
    void salario() {

    }

    @Override
    void formacionContinua() {

    }

    @Override
    void planificarInstalaciones() {

    }

    public TecnicoResponsable(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir, String nombreEquipo, TecnicoOperario[] equipo) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion, especialidad, formacionEspecifica, carnetConducir);
        this.nombreEquipo = nombreEquipo;
        this.equipo = equipo;
    }
}
