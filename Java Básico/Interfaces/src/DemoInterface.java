public class DemoInterface {
    public static void main(String[] args) {
        // Implentando de un interface
        ClaseInterface1 objeto1 = new ClaseInterface1("Eduardo","Corral");
        System.out.println("objeto1.nombre = " + objeto1.nombre);
        System.out.println("objeto1.nombreCompleto() = " + objeto1.nombreCompleto());
        System.out.println("objeto1.CONSTANTE1 = " + objeto1.CONSTANTE1);
        objeto1.metodoInterface1A();
        objeto1.metodoInterface1B();
        System.out.println("-------------------------------------");

        // Implementando de dos interfaces
        ClaseInterface2 objeto2 = new ClaseInterface2("Eduardo","Corral");
        System.out.println("objeto2.nombre = " + objeto2.nombre);
        System.out.println("objeto2.nombreCompleto2() = " + objeto2.nombreCompleto2());
        System.out.println("objeto2.CONSTANTE1 = " + objeto1.CONSTANTE1);
        objeto2.metodoInterface1A();
        objeto2.metodoInterface1B();
        System.out.println("objeto2.CONSTANTE2 = " + objeto2.CONSTANTE2);
        objeto2.metodoInterface2A();
        objeto2.metodoInterface2B();
        System.out.println("-------------------------------------");

        // Heredando de una clase e implementando un interfaz
        ClaseHeredaInterface2 objeto3 = new ClaseHeredaInterface2("Eduardo","Corral","eduardo@corral.es");
        System.out.println("objeto3.nombre = " + objeto3.nombre);
        System.out.println("objeto3.nombreCompleto() = " + objeto3.nombreCompleto());
        System.out.println("objeto3.CONSTANTE1 = " + objeto3.CONSTANTE1);
        objeto3.metodoInterface1A();
        objeto3.metodoInterface1B();
        System.out.println("objeto3.CONSTANTE2 = " + objeto3.CONSTANTE2);
        objeto3.metodoInterface2A();
        objeto3.metodoInterface2B();
    }
}
