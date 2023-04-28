package abstraccion;

abstract class FiguraGeometrica {
    final float PI = 3.1415929f;

    abstract public void perimetro();
    abstract public void superficie();
    abstract public void grafico();

    public void elimar(){
        System.out.println("Borra la figura");
    }
}
