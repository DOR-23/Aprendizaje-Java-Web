package abstraccion;

public class Circulo extends FiguraGeometrica{
    float radio;
    @Override
    public void perimetro() {
        System.out.println("perímetro = " + 2 * PI * radio);
    }

    @Override
    public void superficie() {
        System.out.println("superficie = " + PI * radio * radio );
    }

    @Override
    public void grafico() {
        System.out.println("Dibujo el circulo");
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
}
