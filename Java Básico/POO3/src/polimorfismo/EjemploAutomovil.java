package polimorfismo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Ford","Focus",150,"Hibrido","Manual",4);
        System.out.println(miCoche.marca);

        miCoche.repostar();
    }

}
