package clasesInternas;

public class EjemploInterna {
    public static void main(String[] args) {
        // objeto de la clase externa
        ClaseExterna objExterno = new ClaseExterna();
        System.out.println("objExterno.x = " + objExterno.x);
        objExterno.moduloVector(objExterno.miVector);

        // objeto de la clase interna
        ClaseExterna.Vector unVector = objExterno.new Vector(23,12);
        unVector.coordenadas();
        
        // objeto de la clase interna privada --> no se puede crear objeto
        // ClaseExterna.Interna1 objInterno1 = objExterno.new Interna1();
        
        // objeto de la clase interna static
        ClaseExterna.Interna2 objInterno2 = new ClaseExterna.Interna2();
        System.out.println("objInterno2.j = " + objInterno2.j);
        System.out.println("ClaseExterna.w = " + ClaseExterna.w);
    }
}
