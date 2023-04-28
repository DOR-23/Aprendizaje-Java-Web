public class Herencia {
    public static void main(String[] args) {
        Vehiculo miVehiculo= new Vehiculo();
        miVehiculo.claxon();

        Coche miCoche = new Coche();
        miCoche.abrirMaletero();
        System.out.println("miCoche.marca = " + miCoche.getMarca());
        miCoche.claxon();

        // Pesona -> Alumno -> AlumnoIngenieria
        Persona juan = new Persona();
        juan.caminar();
        // juan.estudiar(); método una subclase

        Alumno juanPerez = new Alumno();
        juanPerez.caminar(); // método de la superclase
        juanPerez.estudiar(); // método propio de Alumno

        AlumnoIngenieria juanPerezLopez = new AlumnoIngenieria();
        juanPerezLopez.caminar();
        juanPerezLopez.estudiar();
        juanPerezLopez.practicas();

    }

}
