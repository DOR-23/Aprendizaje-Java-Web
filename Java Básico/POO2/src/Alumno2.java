//import elpaquete.Contactos;

import java.util.Arrays;



public class Alumno2 {
    // Atributos
    String nombre;
    private String apellidos;
    private String email;
    private Contactos[] grupo;



    // Constructor

    public Alumno2(String nombre, String apellidos, String email, Contactos[] grupo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        // A los contactos que recibe como parámetro le añado ANA
        this.grupo = Arrays.copyOf(grupo, grupo.length+1);
        this.grupo[grupo.length] = Contactos.ANA;
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

    public Contactos[] getGrupo() {
        return grupo;
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

    public void setGrupo(Contactos[] grupo) {
        this.grupo = grupo;
    }
}
