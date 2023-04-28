package empresa;

public class TecnicoOperario extends Tecnico{
    int instalacionesMes;
    int kilometraje;
    String equipo;
    //...
    public void instalar(){
        System.out.println("Instalando");
    }

    public void reparar(){
        System.out.println("Reparando");
    }


    //...
    public void salario(int kilometraje){ // sobrecarga
        System.out.println("salario = fijo + comisión por instalaciones + kilometraje");
    }

    public TecnicoOperario(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir, int instalacionesMes, int kilometraje, String equipo) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion, especialidad, formacionEspecifica, carnetConducir);
        this.instalacionesMes = instalacionesMes;
        this.kilometraje = kilometraje;
        this.equipo = equipo;
    }
}
