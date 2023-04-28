//import elpaquete.Contactos;

public class Alumno {
    // Atributos
    String nombre;
    private String apellidos;
    private String email;
    private Contactos campaniero;

    // Constructor

    public Alumno(String nombre, String apellidos, String email, Contactos campaniero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.campaniero = campaniero;
    }

    // Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Contactos getCampaniero() {
        return campaniero;
    }

    // Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCampaniero(Contactos campaniero) {
        this.campaniero = campaniero;
    }
}
