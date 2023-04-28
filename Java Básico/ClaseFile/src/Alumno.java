public class Alumno {
    String id;
    String nombre;
    String apellido1;
    String apellido2;
    String movil;
    String email;

    public Alumno(String id, String apellido1, String apellido2, String nombre, String movil, String email) {
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.movil = movil;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", movil='" + movil + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
