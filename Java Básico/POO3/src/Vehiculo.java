public class Vehiculo {
    private String marca = "Toyoya";
    String modelo = "Yaris";

    public void claxon(){
        System.out.println("Pi,Pi!");
    }

    public void avanzar(){
        System.out.println("Estoy en marcha!");
    }

    public String getMarca() {
        return marca;
    }

//     void setMarca(String marca) {
//        this.marca = marca;
//    }
}
