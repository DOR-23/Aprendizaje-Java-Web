public class EjemploCoche {
    public static void main(String[] args) {
        // Métodos/atributos estáticos
        Coche.numeroEmergencias = "911";
        Coche.llamarEmergencias(); // Pertenecen a la clase
        System.out.println("Coche.maxVelocidad = " + Coche.maxVelocidad);


        // Instanciar objeto (crear el objeto a partir de una clase)
        Coche miCoche = new Coche();

        miCoche.llamarEmergencias();  // NO es preciso crear el objeto para usarlo
        Coche.llamarEmergencias();
        
        // Asignar valores a los atributos
        miCoche.marca = "Ford";
        miCoche.modelo = "Fiesta";
        miCoche.color = "Verde manzana";
        miCoche.combustible = "Hibrido";
        miCoche.cilindrada = 1600;
        miCoche.potencia = 140;
        miCoche.maxRpm = 6500;
        miCoche.capacidadDeposito = 40;

        // Atributo privado
        //miCoche.km = 12365;
        //System.out.println("miCoche.km = " + miCoche.km);
        // miCoche.setKm(12546); // Sin el método setKm el atributo km está portegido contra escritura
        System.out.println("miCoche.getKm() = " + miCoche.getKm());

        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.puestaEnMarcha();
        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.acelear(50);
        System.out.println("miCoche.rpm = " + miCoche.rpm);

        System.out.println("miCoche.consumo(500) = " + miCoche.consumo(500));
        System.out.println("miCoche.consumo(250,22) = " + miCoche.consumo(250,22));
        System.out.println("miCoche.getKm() = " + miCoche.getKm());
        

        System.out.println("miCoche.toString() = " + miCoche.toString());
        
    }
}
