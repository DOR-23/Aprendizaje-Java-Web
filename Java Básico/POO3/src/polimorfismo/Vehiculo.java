package polimorfismo;

public class Vehiculo {
    String marca;
    String modelo;
    float potencia;

    final public void claxon(){
        System.out.println("Pi,Pi!");
    }

    public void avanzar(){
        System.out.println("Estoy en marcha!");
    }

    public void repostar(){
        System.out.println("repostando!");
    }

    public Vehiculo(String marca, String modelo, float potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }
}
