package empresa;

public class Gerente extends Empleado{
    TecnicoDirector cto;
    ComercialDirector cco;
    AdministrativoDirector om;
    String experiencia;
    String antiguedad;
    //...


    public Gerente(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, TecnicoDirector cto, ComercialDirector cco, AdministrativoDirector om, String experiencia, String antiguedad) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion);
        this.cto = cto;
        this.cco = cco;
        this.om = om;
        this.experiencia = experiencia;
        this.antiguedad = antiguedad;
    }
}
