package empresa;

public class TecnicoDirector extends Tecnico{
    String experiencia;
    String enElCargoDesde;

    public void dirigir(){
        System.out.println("Dirigiendo");
    }

    public void supervisaResponables(){
        // ....
    }

    public void planificaReuniones(){
        // ...
    }

    public void salario(float bonus){
        System.out.println("salario = fijo + bonus");
    }

    public TecnicoDirector(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion, String especialidad, String formacionEspecifica, String carnetConducir, String experiencia, String enElCargoDesde) {
        super(nombre, apellidos, dni, domicilio, email, numSS, formacion, especialidad, formacionEspecifica, carnetConducir);
        this.experiencia = experiencia;
        this.enElCargoDesde = enElCargoDesde;
    }
}
