public class Coche {
    // Atributos (características/estados/campos)
    String marca;
    String modelo;
    String color;
    String combustible;
    float potencia;
    float cilindrada;
    float rpm = 0;
    float maxRpm = 7000;
    final static float maxVelocidad = 180;
    float capacidadDeposito;
    static String numeroEmergencias = "112";
    private float km = 0;

    // Métodos (comportamiento)
    public void puestaEnMarcha(){
        this.rpm = 800;
    }

    public void pararMotor(){
        this.rpm = 0;
    }

    public void acelear(float rpm){ // aceleracion en porcentaje 0 .. 100 %
                                    // this.rpm se refiere al atributo de la clase
                                    // rpm se refiere al parámetro del método
        if(this.rpm > 0){
            this.rpm = 800 + (this.maxRpm - 800) * rpm / 100;
        }else{
            System.out.println("Arranca el coche");
        }
    }

    public static void llamarEmergencias(){
        System.out.println("Llamando a Emergencias: " + numeroEmergencias);
    }

    public float consumo(float distancia, float repostado){
        this.km += distancia;
        return repostado/distancia * 100;
    }

    public float consumo(float distancia){
        this.km += distancia;
        return this.capacidadDeposito/distancia * 100;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\n' +
                ", modelo='" + modelo + '\n' +
                ", color='" + color + '\n' +
                ", combustible='" + combustible + '\n' +
                ", potencia=" + potencia + '\n' +
                ", cilindrada=" + cilindrada + '\n' +
                ", capacidadDeposito=" + capacidadDeposito + '\n' +
                "km= " + km;
    }

    public float getKm() {
        return km;
    }

//    public void setKm(float km) {
//        this.km = km;
//    }
}
