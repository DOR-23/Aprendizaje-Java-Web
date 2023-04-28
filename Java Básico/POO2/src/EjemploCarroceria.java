public class EjemploCarroceria {
    public static void main(String[] args) {

        // equivalente a Clase variable = new Clase(nombre, descripcion , puertas);
        Carroceria miCoche = Carroceria.BERLINA; // ejecuta el método constructor
        System.out.println("miCoche = " + miCoche);
        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());
        System.out.println("miCoche.descripcion = " + miCoche.getDescripcion());
        System.out.println("miCoche.getNumeroPuertas() = " + miCoche.getNumeroPuertas());

        //miCoche.descripcion = "pequeño"; // el atributo es fina ly no se puede "escribir" en el

    }
}
