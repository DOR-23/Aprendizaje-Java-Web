package elpaquete.elsubpaquete;
public class PruebaPaquete {
    String nombre;
    private String apellido;
    public String email;
    protected String telefono;

    public static void mensaje(){
        System.out.println("Hola mensaje de prueba");
    }

    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // metodo defecto
    void metodoDefecto (){
        System.out.println("Método Defecto");
    }

    // público
    public void metodoPublico(){
        System.out.println("Método Público");
    }

    // private
    private void metodoPrivado(){
        System.out.println("Método Privado");
    }

    // protected
    protected void metodoProtected(){
        System.out.println("Método Protected");
    }

    public void ejecutaMetodoPrivado(){
        metodoPrivado();
    }
}
