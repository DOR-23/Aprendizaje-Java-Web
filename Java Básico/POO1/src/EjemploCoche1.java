public class EjemploCoche1 {
    public static void main(String[] args) {
        // Instanciar objeto
        Coche1 tuCoche = new Coche1();
        System.out.println("tuCoche.toString() = " + tuCoche.toString());

        Coche1 elCoche = new Coche1("Ford");
        System.out.println("elCoche.toString() = " + elCoche.toString());

        Coche1 suCoche = new Coche1("Ford","Fiesta");
        System.out.println("suCoche.toString() = " + suCoche.toString());

        Coche1 unCoche = new Coche1("Ford","Fiesta","Verde","Hóibrido",140,1600,0,6400,40);
        System.out.println("unCoche.toString() = " + unCoche.toString());
    }



}
