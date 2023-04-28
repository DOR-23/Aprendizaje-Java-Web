package clasesInternas;

public class ClaseExterna {
    int x = 100;
    int y = 25;
    Vector miVector = new Vector (8,12);
    Vector tuVector = new Vector(4,3);
    Interna1 a; // De clase interna privada
    Interna2 b; // De clase interna static
    static int w = 125; // static para poder emplearlo en clase interna static o sin crear objetpo

    // metodo
    public void moduloVector(Vector vec){
        System.out.println("módulo = " + Math.sqrt(Math.pow(vec.x,2) + Math.pow(vec.y,2)));
    }

    class Vector{
        // atributos
        int x;
        int y;

        // metodo
        public void coordenadas(){
            System.out.println("x = "+ this.x + " --> y = " + this.y + " ext.x =" + ClaseExterna.this.x);
        }

        // clase interna
        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Interna1{
        int h = 123;

        @Override
        public String toString() {
            return "Interna1{" +
                    "h=" + h +
                    '}';
        }
    }

    static class Interna2{
        int j = 2 * ClaseExterna.w;

    }
}
