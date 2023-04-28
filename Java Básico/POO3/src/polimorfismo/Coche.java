package polimorfismo;

public class Coche extends Vehiculo {
    String combustible;
    String transmision;
    int ruedas;

    public void abrirMaletero(){
        System.out.println("Abriendo Maletero!");
    }

    // No es posible anular un método final del padre
//    public void claxon(){
//        System.out.println("hola");
//    }
    public void avanzar(){
        System.out.println("Avanzando sobreescrito");
    }

    public void repostar(){
        System.out.println("abro el tapó y ");
        super.repostar();
        System.out.println("hasta llenarlo");
    }

    public Coche(String marca, String modelo, float potencia, String combustible, String transmision, int ruedas) {
        super(marca, modelo, potencia);
        this.combustible = combustible;
        this.transmision = transmision;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "combustible='" + combustible + '\'' +
                ", transmision='" + transmision + '\'' +
                ", ruedas=" + ruedas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
