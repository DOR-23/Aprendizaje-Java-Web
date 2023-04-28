abstract class ClaseAbstracta implements Interface1{
    // Atributos
    String nombre;
    String apellido;
    //...

    // Métodos "normales"
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }

    // Métodos abstractos
    abstract void metodoAbstracta1();
    abstract void metodoAbstracta2();
}
