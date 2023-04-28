package empresa.abstracto;

abstract class Empleado {
    // Atributos = todos los datos de filiación del trabajador
    String nombre;
    String apellidos;
    String dni;
    String domicilio;
    String email;
    //...
    String numSS;
    String formacion;

    // Métodos -> comunes a cualquier trabajador
    public void fichar(){
        System.out.println("Fichando!");
    }

    public void bajaLaboral(){
        System.out.println("Estoy de baja!");
    }

    // abstractos
    abstract void vacaciones();
    abstract void salario();
    abstract void formacionContinua();

    public Empleado(String nombre, String apellidos, String dni, String domicilio, String email, String numSS, String formacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.numSS = numSS;
        this.formacion = formacion;
    }
}
