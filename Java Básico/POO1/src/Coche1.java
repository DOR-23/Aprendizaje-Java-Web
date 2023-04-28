public class Coche1 {
    // Atributos (características/estados/campos)
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private float potencia;
    private float cilindrada;
    private float rpm;
    private float maxRpm;
    final static float maxVelocidad = 180;
    private float capacidadDeposito;
    static String numeroEmergencias = "112";
    private float km;

    // Métodos (comportamiento)
    // TODO


    // Constructores
    // Sin parámetros
    public Coche1(){
        rpm = 0;
        km = 4;
    }

    public Coche1(String marca){
//        rpm = 0;
//        km = 4;
        this();
        this.marca = marca;
    }

    public Coche1(String marca, String modelo){
//        rpm = 0;
//        km = 4;
//        this.marca = marca;
        this(marca);
        this.modelo = modelo;
    }

    public Coche1(String marca, String modelo, String color) {
//        this.marca = marca;
//        this.modelo = modelo;
        this(marca,modelo);
        this.color = color;
    }

    public Coche1(String marca, String modelo, String color, String combustible) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.color = color;
        this(marca,modelo,color);
        this.combustible = combustible;
    }

    public Coche1(String marca, String modelo, String color, String combustible, float potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
    }

    public Coche1(String marca, String modelo, String color, String combustible, float potencia, float cilindrada, float rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.rpm = rpm;
    }

    public Coche1(String marca, String modelo, String color, String combustible, float potencia, float cilindrada, float rpm, float maxRpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.rpm = rpm;
        this.maxRpm = maxRpm;
    }

    public Coche1(String marca, String modelo, String color, String combustible, float potencia, float cilindrada, float rpm, float maxRpm, float capacidadDeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.rpm = rpm;
        this.maxRpm = maxRpm;
        this.capacidadDeposito = capacidadDeposito;
    }

    // Getter

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCombustible() {
        return combustible;
    }

    public float getPotencia() {
        return potencia;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public float getRpm() {
        return rpm;
    }

    public float getMaxRpm() {
        return maxRpm;
    }

    public float getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public float getKm() {
        return km;
    }


    // Setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setRpm(float rpm) {
        this.rpm = rpm;
    }

    public void setMaxRpm(float maxRpm) {
        this.maxRpm = maxRpm;
    }

    public void setCapacidadDeposito(float capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public void setKm(float km) {
        this.km = km;
    }


    // toString

    @Override
    public String toString() {
        return "Coche1{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", rpm=" + rpm +
                ", maxRpm=" + maxRpm +
                ", capacidadDeposito=" + capacidadDeposito +
                ", km=" + km +
                '}';
    }
}
